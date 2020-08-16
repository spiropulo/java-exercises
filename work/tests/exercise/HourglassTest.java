package exercise;

import org.junit.Assert;
import org.junit.Test;

public class HourglassTest {
    @Test
    public void testThis() {
        int[][] input = {{1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}};

        int resultCount = Hourglass.countNumberOfHourglasses(input);
        int resultSum = Hourglass.maximunHourglassValue(input);
        Assert.assertEquals(19, resultSum);
        Assert.assertEquals(16, resultCount);
    }

    @Test
    public void testThisNegative() {
        int[][] input = {{-1, -1, 0, -9, -2, -2},
                {-2, -1, -6, -8, -2, -5},
                {-1, -1, -1, -2, -3, -4},
                {-1, -9, -2, -4, -4, -5},
                {-7, -3, -3, -2, -9, -9},
                {-1, -3, -1, -2, -4, -5}};

        int resultSum = Hourglass.maximunHourglassValue(input);
        Assert.assertEquals(-6, resultSum);
    }
}
