package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameScoringSystemTest {

    @Test
    public void testDefeatKnownEnemy() {
        GameScoringSystem scoringSystem = new GameScoringSystem();
        scoringSystem.defeatEnemy("Zombie");
        assertEquals(100, scoringSystem.getTotalScore());
    }

    @Test
    public void testDefeatUnknownEnemy() {
        GameScoringSystem scoringSystem = new GameScoringSystem();
        scoringSystem.defeatEnemy("Unknown");
        assertEquals(0, scoringSystem.getTotalScore());
    }

    @Test
    public void testAddNewEnemyType() {
        GameScoringSystem scoringSystem = new GameScoringSystem();
        scoringSystem.addEnemyType("Alien", 250);
        scoringSystem.defeatEnemy("Alien");
        assertEquals(250, scoringSystem.getTotalScore());
    }

    @Test
    public void testAggregateScore() {
        GameScoringSystem scoringSystem = new GameScoringSystem();
        scoringSystem.defeatEnemy("Zombie");
        scoringSystem.defeatEnemy("Vampire");
        assertEquals(250, scoringSystem.getTotalScore());
    }
}