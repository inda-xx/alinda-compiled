public class Player {
    private String id;
    private String name;
    private int health;
    private int attackPower;

    public Player(String id, String name, int health, int attackPower) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack(Enemy enemy) {
        System.out.println(name + " attacks " + enemy.getName() + " with power " + attackPower);
        enemy.takeDamage(attackPower);
    }

    public void move(String direction) {
        System.out.println(name + " moves " + direction);
    }

    @Override
    public String toString() {
        return "Player{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", attackPower=" + attackPower +
                '}';
    }
}