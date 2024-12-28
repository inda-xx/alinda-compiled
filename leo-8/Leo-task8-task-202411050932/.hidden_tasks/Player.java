public class Player {
    private int x, y;

    public void move(char direction) {
        switch (direction) {
            case 'W': // move up
                y--;
                break;
            case 'A': // move left
                x--;
                break;
            case 'S': // move down
                y++;
                break;
            case 'D': // move right
                x++;
                break;
            default:
                System.out.println("Invalid direction. Use W, A, S, D for movement.");
        }
    }
}