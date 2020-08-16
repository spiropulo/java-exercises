package exercise;

public class WordInMetrix {
    public static boolean hasWord(String[][] input, String word) {
        char[] word_ = word.toCharArray();
        int index = 0;
        String firstLetter = String.valueOf(word_[index]);

        for (int row = 0; row < input.length; row++) {
            for (int col = 0; col < input[row].length; col++) {
                if (firstLetter.equals(input[row][col])) {
                    return found(input, row, col, word_, index);
                }
            }
        }

        return false;
    }

    private static boolean match(String[][] input, int row, int col, char[] word_, int newIndex, String match) {
        try {
            String letter = input[row][col];
            if (match.equals(letter)) {
                return found(input, row, col, word_, newIndex);
            }
        } catch (Exception e) {
        }
        return false;
    }

    private static boolean found(String[][] input, int row, int col, char[] word_, int index) {
        int newIndex = index + 1;
        if (newIndex == word_.length) {
            return true;
        }

        char c = word_[newIndex];
        String nextLetter = String.valueOf(c);

        if (match(input, row - 1, col - 1, word_, newIndex, nextLetter) ||
                match(input, row - 1, col, word_, newIndex, nextLetter) ||
                match(input, row - 1, col + 1, word_, newIndex, nextLetter) ||

                match(input, row, col - 1, word_, newIndex, nextLetter) ||
                match(input, row, col + 1, word_, newIndex, nextLetter) ||

                match(input, row + 1, col - 1, word_, newIndex, nextLetter) ||
                match(input, row + 1, col, word_, newIndex, nextLetter) ||
                match(input, row + 1, col + 1, word_, newIndex, nextLetter)) {
            return true;
        }

        return false;
    }
}
