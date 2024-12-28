public class Enemy {
    private String id;
    private String name;
    private int health;
    private int attackPower;

    public Enemy(String id, String name, int health, int attackPower) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " takes " + damage + " damage");
        if (health <= 0) {
            System.out.println(name + " is defeated!");
        } else {
            System.out.println(name + " has " + health + " health remaining");
        }
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", attackPower=" + attackPower +
                '}';
    }
}