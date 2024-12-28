public class MainCharacter{
    
//fields
private double horizontalX;
private double verticalY;
private int score;
int mapWidth = 100;
int mapHeight = 100;

//constructors
MainCharacter(double horizontalX, double verticalY, int score){
    this.horizontalX = horizontalX;
    this.verticalY = verticalY;
    this.score = score;
}

//getters
public double getHorizontalX{
    return horizontalX;
}
public double getVerticalY{
    return verticalY;
}
public int getScore{
    return score;
}
//setters
public void setHorizontalX(int horizontalX){
    if(horizontalX<=100)
    this.horizontalX = horizontalX;
}
public void setVerticalY(int verticalY){
    if(verticalY<=100)
    this.verticalY = verticalY;
}
public void setScore(int score){
    this.score = score;
}

public void movePlayer(int deltaX, int deltaY){
}

public boolean checkCollision(Enemy enemy){
if player = 
}

public static void main(String[] args) {
MainCharacter player = new MainCharacter(50, 50, 0)
}




}