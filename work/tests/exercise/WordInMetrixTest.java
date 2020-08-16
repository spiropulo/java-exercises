package exercise;

import org.junit.Assert;
import org.junit.Test;

public class WordInMetrixTest {
    String[][] input1 = {
            {"1", "1", "1", "0", "0", "0"},
            {"0", "1", "0", "0", "0", "0"},
            {"1", "1", "h", "0", "0", "0"},
            {"0", "0", "e", "l", "4", "0"},
            {"0", "0", "0", "l", "0", "0"},
            {"0", "0", "1", "o", "4", "0"}
    };

    String[][] input2 = {
            {"h", "1", "1", "0", "0", "0"},
            {"e", "1", "0", "0", "0", "0"},
            {"l", "1", "h", "0", "0", "0"},
            {"l", "0", "e", "l", "4", "0"},
            {"o", "0", "0", "l", "0", "0"},
            {"0", "0", "1", "o", "4", "0"}
    };

    String[][] input3 = {
            {"1", "1", "1", "0", "0", "0"},
            {"0", "1", "0", "0", "0", "0"},
            {"1", "1", "h", "0", "0", "0"},
            {"0", "0", "e", "l", "4", "0"},
            {"0", "0", "0", "l", "0", "h"},
            {"0", "0", "o", "l", "l", "e"}
    };

    String[][] input4 = {
            {"1", "1", "1", "0", "0", "0"},
            {"0", "1", "0", "0", "0", "0"},
            {"1", "1", "h", "0", "0", "0"},
            {"0", "0", "e", "l", "4", "0"},
            {"0", "0", "0", "X", "0", "0"},
            {"0", "0", "1", "o", "4", "0"}
    };

    @Test
    public void word() {
        String word = "hello";
        Assert.assertTrue(WordInMetrix.hasWord(input1, word));
        Assert.assertTrue(WordInMetrix.hasWord(input2, word));
        Assert.assertTrue(WordInMetrix.hasWord(input3, word));
        Assert.assertFalse(WordInMetrix.hasWord(input4, word));
    }
}
