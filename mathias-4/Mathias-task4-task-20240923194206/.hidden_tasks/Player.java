public class Player {
    private int position;
    private int speed;

    public Player() {
        this.position = 0;
        this.speed = 1;
    }

    public int getPosition() {
        return position;
    }

    public void moveRight(int steps) {
        int targetPosition = position + speed * steps;
        boolean isMovingRight = true;
        while (isMovingRight && position < targetPosition) {
            position++;
            if (position >= targetPosition) {
                isMovingRight = false;
            }
        }
        System.out.println("Player moved to position " + position);
    }

    public void moveLeft(int steps) {
        int targetPosition = position - speed * steps;
        boolean isMovingLeft = true;
        while (isMovingLeft && position > targetPosition) {
            position--;
            if (position <= targetPosition) {
                isMovingLeft = false;
            }
        }
        System.out.println("Player moved to position " + position);
    }
}