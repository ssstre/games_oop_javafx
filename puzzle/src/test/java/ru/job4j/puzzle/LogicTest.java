package ru.job4j.puzzle;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@Ignore
public class LogicTest {
    @Test
    public void whenVerticalWin() {
        Logic logic = new Logic(5) {
            @Override
            public int[][] convert() {
                return new int[][]{
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 1},
                };
            }
        };
        Assert.assertTrue(logic.isWin());
    }

    @Test
    public void whenHorizontalWin() {
        Logic logic = new Logic(5) {
            @Override
            public int[][] convert() {
                return new int[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {1, 1, 1, 1, 1},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                };
            }
        };
        Assert.assertTrue(logic.isWin());
    }

    @Test
    public void whenNotWin() {
        Logic logic = new Logic(5) {
            @Override
            public int[][] convert() {
                return new int[][]{
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                        {1, 1, 0, 1, 1},
                        {0, 0, 1, 0, 0},
                        {0, 0, 1, 0, 0},
                };
            }
        };
        Assert.assertFalse(logic.isWin());
    }

    @Test
    public void whenNotWinL() {
        Logic logic = new Logic(5) {
            @Override
            public int[][] convert() {
                return new int[][]{
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0},
                        {0, 0, 0, 1, 0},
                        {1, 1, 1, 1, 0},
                };
            }
        };
        Assert.assertFalse(logic.isWin());
    }
}


