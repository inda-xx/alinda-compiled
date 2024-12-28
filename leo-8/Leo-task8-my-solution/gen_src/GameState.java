/**
 * Hanterar spelets tillstånd, inklusive spelarens och fiendernas positioner och interaktioner.
 * GameState ansvarar för att uppdatera spelet baserat på spelarens och fiendernas status.
 */
public class GameState {
    private Player player;
    private Enemy[] enemies;

    /**
     * Skapar ett nytt GameState-objekt med en spelare och en lista med fiender.
     * @param player spelaren i spelet
     * @param enemies en array av fiender som spelaren kan stöta på
     */
    public GameState(Player player, Enemy[] enemies) {
        this.player = player;
        this.enemies = enemies;
    }

    /**
     * Hämtar spelarens aktuella rum.
     * @return spelarens nuvarande rum
     */
    public Room getCurrentRoom() {
        return player.getCurrentRoom();
    }

    /**
     * Hämtar spelaren i spelet.
     * @return spelarobjektet
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Hämtar listan av fiender i spelet.
     * @return en array med alla fiender i spelet
     */
    public Enemy[] getEnemies() {
        return enemies;
    }

    /**
     * Uppdaterar spelets tillstånd genom att kontrollera om spelaren är på samma plats
     * som någon fiende i samma rum. Om så är fallet interagerar spelaren med fienden.
     * Om spelarens poäng går under eller lika med noll avslutas spelet.
     */
    public void update() {
        boolean interactionOccurred = false;
    
        for (Enemy enemy : enemies) {
            // Kontrollera om spelaren och fienden är i samma rum och på samma position
            if (enemy.getCurrentRoom() == player.getCurrentRoom() && 
                enemy.getPositionX() == player.getPositionX() &&
                enemy.getPositionY() == player.getPositionY()) {

                enemy.interact(player);
                interactionOccurred = true;

                // Skriv ut information om interaktionen
                System.out.println("Du stöter på fienden: " + enemy.getType());
                System.out.println("Fiendens återstående hälsa: " + enemy.getHealth());
                System.out.println("Din aktuella hälsa: " + player.getScore());
                System.out.println("Din aktuella poäng: " + player.getScore());
            }
        }
    
        // Kontrollera om spelaren har förlorat
        if (player.getScore() <= 0) {
            System.out.println("Din hälsa är noll eller lägre. Du har förlorat spelet.");
            System.exit(0);  // Avslutar spelet
        }
    
        if (!interactionOccurred) {
            System.out.println("Ingen fiende här.");
        }
    }     
}


