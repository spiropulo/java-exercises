package exercise;

import org.junit.Assert;
import org.junit.Test;

public class SortReverseOrderTest {
    @Test
    public void testThis() {
        int[] x = {1, 4, 3, 2};
        int[] r = SortReverseOrder.reverseArray(x);
        int[] c = {2, 3, 4, 1};
        Assert.assertArrayEquals(r, c);
    }
}
