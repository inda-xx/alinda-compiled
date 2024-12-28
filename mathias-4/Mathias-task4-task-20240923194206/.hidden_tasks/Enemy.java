public class Enemy {
    private int position;
    private int health;

    public Enemy(int position, int health) {
        this.position = position;
        this.health = health;
    }

    public int getPosition() {
        return position;
    }

    public int getHealth() {
        return health;
    }

    public boolean attack(int power) {
        // Simple damage calculation
        health -= power;
        if (health <= 0) {
            System.out.println("Enemy at position " + position + " has been defeated.");
            return true;
        }
        return false;
    }

    // Overloaded attack methods for different interaction
    public boolean attack(String weaponType) {
        int damage;
        switch (weaponType.toLowerCase()) {
            case "fire":
                damage = 50;
                break;
            case "ice":
                damage = 30;
                break;
            default:
                damage = 10;
                break;
        }
        return attack(damage);
    }
}