
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;

//the main class of the game 
//creates the rooms and takes commands from the player
public class AdventureGame 
{
    private static GameState gameState;
    private static final String PROMPT = "> ";
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);
    private static Map<String, Room> rooms = new HashMap<>();
    private static ArrayList<Key> foundKeys = new ArrayList<>();

    public static void main(String[] args) 
    {
        generateRoomsFromFile("rooms.txt");
        gameState = new GameState(rooms.get("Hallway"));
        printWelcomeMessage();

        while (true) 
        {
            String command = getCommand();
            CommandParser.parse(command, gameState);
        }
    }
    
    //reads and returns command from player
    private static String getCommand() 
    {
        System.out.print(PROMPT);
        String command = scanner.nextLine();
        command = command.replaceFirst(PROMPT, ""); //remove the prompt
        return command;
    }

    //prints weclome message with information on the game
    private static void printWelcomeMessage() 
    {
        System.out.println("Welcome!");
        System.out.println("Type \"go [direction]\" to move to a different room");
        System.out.println("Type \"Look\" to look around the room");
        System.out.println("Type \"Search\" to search to room for useful items");
        System.out.println("Type \"keys\" to see how many keys you have");
        System.out.println("Type \"unlock\" to attempt to use a key");
        System.out.println("Type \"Help\" for a list of commands\n");
        gameState.getCurrentRoom().printDescription();
    }

    //reads file and creates rooms and connections between them
    private static void generateRoomsFromFile(String filename) 
    {
        try
        {
            //first pass to create rooms
            BufferedReader file = new BufferedReader(new FileReader(filename));
            String line = file.readLine();

            while (line != null) 
            {  
                String[] elements = (line.split(";"));
                createRoom(elements);
                line = file.readLine();
            }
            file.close(); 
            
            //second pass to add exits and keys
            file = new BufferedReader(new FileReader(filename));
            line = file.readLine();

            while (line != null) 
            {
                String[] elements = (line.split(";"));
                if (true) 
                {
                    createExit(elements);
                    createKey(elements);
                }
                line = file.readLine();
            }
            file.close();

        }
        catch (IOException e) 
        {
            System.out.println("Something went wrong when initiating the rooms: " + e.getMessage()); 
            System.exit(1);     
        }
    }

    //takes a string and creates a room
    private static void createRoom(String[] elements)
    {
        
            if (elements[0].equals("Room")) 
            {
                rooms.put(elements[1], new Room(elements[2], elements[1]));
            }
    }
    //takes a string and creates an exit
    private static void createExit(String[] elements)
    {
            if (elements[0].equals("Exit")) 
            {
                Room room = rooms.get(elements[1]);
                room.addExit(elements[2], rooms.get(elements[3]));
            }
    }

    //takes a string and creates a key
    private static void createKey(String[] elements)
    {
            if (elements[0].equals("Key")) 
            {
                Room room = rooms.get(elements[4]);
                room.addKey(rooms.get(elements[1]),elements[2],rooms.get(elements[3]));
            }
    }

    public static Room getRoom(String room)
    {
        return rooms.get(room);
    }

    //adds keyes to the foundKeys list
    public static void addKey(Key key)
    {
        foundKeys.add(key);
    }

    public static void useKey()
    {
        if (foundKeys.size() < 1) 
        {
            System.out.println("You don't have any keys");
        }
        else
        {
            Key usedKey = null;
            boolean unlockedExit = false;

        for (Key key : foundKeys) 
        {
            if (key.UnlockExit()) 
            {
                unlockedExit = true;
                usedKey = key;
            }
        }
        if (unlockedExit) 
        {
            foundKeys.remove(usedKey);
        }
        else
        {
            System.out.println("None of your keys fit here");
        }
        }
    }

    public static void printFoundKeys()
    {
        System.out.println("You have " + foundKeys.size() + " keys");
    }

    //allow access to the gamestate
    public static GameState getGameState()
    {
            return gameState;
    }
}
    
//keeps track of the state of the game, (current room)
class GameState 
    {
        private Room currentRoom;
        
        //constructor: sets the starting room
        public GameState(Room startingRoom) 
        {
            currentRoom = startingRoom;
        }
        
        public Room getCurrentRoom() 
        {
            return currentRoom;
        }
        
        public void setCurrentRoom(Room newRoom) 
        {
            currentRoom = newRoom;
        }
    }
    
//containst information about rooms and connections
//allows movement to other rooms and can print information
class Room 
    {
        private Map<String, Room> exits = new HashMap<>();
        private Key key;
        private String description;
        private String name;
        
        //constructor
        public Room(String description, String name) 
        {
            this.description = description;
            this.name = name;
        }

        //adds a connection between this and another room
        public void addExit(String direction, Room toRoom) 
        {
            exits.put(direction,toRoom);
        }
        public void addKey(Room from, String direction, Room to)
        {
            key = new Key(from,direction,to);
        }

        public String getName()
        {
            return name;
        }
        
        //moves to another room in given direction
        public void moveInDirection(String direction) 
        {
            if (exits.containsKey(direction)) 
            {
                AdventureGame.getGameState().setCurrentRoom(exits.get(direction));
            System.out.println(exits.get(direction).description);
            }
            else
            {
                printNoSuchDirectionMessage(direction);
            }

        }
    
    //prints out all the available connections
    public void printExits() 
    {
        System.out.print("Available directions are: ");
        for (String direction : exits.keySet()) 
        {
            System.out.print(direction + " ");
            
        }
        System.out.println();
    }

    //prints the description of the room and available exits
    public void lookAround() 
    {
        printDescription();
        printExits();
    }

    //searches the room for items
    public void Search()
    {
        if (key != null) 
        {
            AdventureGame.addKey(key);
            System.out.println("You have found a key! I wonder what it might unlock?");
        }
        else
        {
            System.out.println("There's nothing here...");
        }    
    }

    public void printDescription()
    {
        System.out.println(description);
    }

    private void printNoSuchDirectionMessage(String direction)
    {   
        System.out.println("Sorry, \"" + direction + "\" is not available");
    }

}

//interprestes the commands and takes the requested action
class CommandParser 
{

    public static void parse(String command, GameState state) 
    {
        //if command is empty, print errr message
        if (command == null) 
        {
            printInvalidCommandMessage();
            return;
        }
    
        String[] splitCommand = command.trim().toLowerCase().split("\\s+");
        switch (splitCommand[0]) 
        {
            case "go":
                if (splitCommand.length >= 2) //check if a direction is specified
                {
                    AdventureGame.getGameState().getCurrentRoom().moveInDirection(splitCommand[1]);
                } 
                else 
                {
                    System.out.println("Please specify a direction to go.");
                }
                break;
    
            case "look":
                AdventureGame.getGameState().getCurrentRoom().lookAround();
                break;
            
            case "search":
                AdventureGame.getGameState().getCurrentRoom().Search();
                break;
            
            case "unlock":
            AdventureGame.useKey();
            break;

            case "keys":
            AdventureGame.printFoundKeys();
            break;
            
            
            case "help":
            printHelpMessage();
             break;

            default:
                printInvalidCommandMessage();
                break;
        }
    }

    public static void printHelpMessage() 
    {
        System.out.println("How to play:");
        System.out.println("Type \"go [direction]\" to move to a different room");
        System.out.println("Type \"Look\" to look around the room");
        System.out.println("Type \"Search\" to search to room for useful items");
        System.out.println("Type \"keys\" to see how many keys you have");
        System.out.println("Type \"unlock\" to attempt to use a key");
        System.out.println("Type \"Help\" to show this list\n");
    }
    public static void printInvalidCommandMessage()
    {
        System.out.println("Sorry, the command was not recognized");
    }
}

class Key 
{
    Room fromRoom;
    String direction;
    Room toRoom;

    //an item that can be found and
    public Key(Room from, String direction, Room to)
    {
        fromRoom = from;
        this.direction = direction;
        toRoom = to;
    }

    public boolean UnlockExit()
    {
        Room currentRoom = AdventureGame.getGameState().getCurrentRoom();

        if (currentRoom == fromRoom) //check if in corect room
        {
            currentRoom.addExit(direction, toRoom);
            System.out.println("You have unlocked " + toRoom.getName() + " in direction " + direction);
            return true;
        }
        else
        {
            return false;
        }
    }
   
}