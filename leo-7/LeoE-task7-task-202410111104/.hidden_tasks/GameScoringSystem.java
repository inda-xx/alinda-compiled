import java.util.Map;
import java.util.HashMap;

public class GameScoringSystem {
    private HashMap<String, Integer> enemyScores;
    private int totalScore;

    public GameScoringSystem() {
        enemyScores = new HashMap<>();
        totalScore = 0;
        initializeEnemyScores();
    }

    // Initialize common enemy types and their scores
    private void initializeEnemyScores() {
        enemyScores.put("Zombie", 100);
        enemyScores.put("Vampire", 150);
        enemyScores.put("Ghost", 200);
    }

    // Add a new type of enemy
    public void addEnemyType(String enemy, int score) {
        enemyScores.put(enemy, score);
    }

    // Update score after defeating an enemy
    public void defeatEnemy(String enemy) {
        if (enemyScores.containsKey(enemy)) {
            totalScore += enemyScores.get(enemy);
        }
    }

    // Calculate total score
    public int getTotalScore() {
        return totalScore;
    }

    public static void main(String[] args) {
        GameScoringSystem scoringSystem = new GameScoringSystem();
        scoringSystem.defeatEnemy("Zombie");
        scoringSystem.defeatEnemy("Vampire");

        System.out.println("Total Score: " + scoringSystem.getTotalScore()); // Expects 250
    }
}