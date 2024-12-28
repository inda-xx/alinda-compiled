public class Enemy{
    
    //fields
    private double horizontalX;
    private double verticalY;
    private int score;
    int mapWidth = 100;
    int mapHeight = 100;
    
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
    
    public void moveEnemy(int deltaX, int deltaY){
    }
    
    
    
    
    
    
    }