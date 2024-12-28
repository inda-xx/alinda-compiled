class Enemy {
    int enemyX, enemyY;

    public Enemy(int x, int y) {
        this.enemyX = x;
        this.enemyY = y;
    }

    // Method to check if player encounters enemy
    public boolean encounter(int playerX, int playerY) {
        return playerX == enemyX && playerY == enemyY;
    }

    // Overloaded method to check if player with weapon encounters the enemy
    public boolean encounter(int playerX, int playerY, boolean hasWeapon) {
        return playerX == enemyX && playerY == enemyY && hasWeapon;
    }

    public static void main(String[] args) {
        Enemy enemy = new Enemy(5, 5);
        System.out.println("Enemy encounter without weapon: " + enemy.encounter(5, 5));
        System.out.println("Enemy encounter with weapon: " + enemy.encounter(5, 5, true));
    }
}