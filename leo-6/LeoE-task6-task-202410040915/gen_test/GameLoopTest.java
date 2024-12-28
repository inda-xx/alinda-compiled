package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameLoopTest {

    private GameLoop gameLoop;

    @Before
    public void setUp() {
        gameLoop = new GameLoop();
    }

    @Test
    public void testGameLoopExecutionWithoutErrors() {
        // This test checks if the run method executes without throwing an exception.
        gameLoop.run();
    }
}