package exercise;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BinaryTreeTest {
    /**
     * 1       2
     * 4   5   6   7
     * 3       8
     */
    private List<ParentChild> input = Arrays.asList(
            new ParentChild(1, 4),
            new ParentChild(1, 5),
            new ParentChild(2, 6),
            new ParentChild(2, 7),
            new ParentChild(4, 3),
            new ParentChild(5, 3),
            new ParentChild(6, 8),
            new ParentChild(7, 8)
    );


    @Test
    public void noParents() {
        Set<Integer> result = BinaryTree.noParents(this.input);
        Assert.assertArrayEquals(new int[]{1, 2}, result.stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    public void oneParent() {
        Set<Integer> result = BinaryTree.oneParent(this.input);
        Assert.assertArrayEquals(new int[]{4, 5, 6, 7}, result.stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    public void returnAll() {
        List<Set<Integer>> result = BinaryTree.returnAll(this.input);

        List<Set<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.stream(new int[]{1, 2}).boxed().collect(Collectors.toSet()));
        expected.add(Arrays.stream(new int[]{4, 5, 6, 7}).boxed().collect(Collectors.toSet()));

        Assert.assertEquals(expected, result);
    }
}
