package exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * An hour glass is represent in a matrix by the following structure
 * 0 0 0
 *   0
 * 0 0 0
 *
 * This structure:
 *
 * 1 2 3 4
 * 5 6 7 8
 * 9 0 1 2
 *
 * Contains 2 hour glasses
 *
 * 1 2 3           2 3 4
 *   6               7
 * 9 0 1     AND   0 1 2
 */
public class Hourglass {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * This function calculates the value each hour glass and
     * returns the highest value.
     * @param matrix with hour glasses
     * @return
     */
    public static int maximunHourglassValue(int[][] arr) {
        int result = 0;
        boolean setResult = true;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                try {

                    if(setResult){
                        result = hourlgass(arr, row, col);
                        setResult = false;
                        continue;
                    }

                    int hourlgass = hourlgass(arr, row, col);
                    if(hourlgass > result){
                        result = hourlgass;
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }

        return result;
    }

    /**
     * This function tells us how many hour glasses are present in the metrix.
     * @param matrix with hour glasses
     * @return
     */
    public static int countNumberOfHourglasses(int[][] arr) {
        int result = 0;
        for (int row = 0; row < arr.length; row++) {
            System.out.println();
            for (int col = 0; col < arr[row].length; col++) {
                try {
                    hourlgass(arr, row, col);
                } catch (Exception e) {
                    continue;
                }
                result += 1;
            }
        }

        return result;
    }

    private static int hourlgass(int[][] arr, int row, int col) throws Exception {
        int upperLeft = arr[row][col];
        int upperMiddle = arr[row][col + 1];
        int upperRight = arr[row][col + 2];
        int middle = arr[row + 1][col + 1];
        int bottomLeft = arr[row + 2][col];
        int bottomMiddle = arr[row + 2][col + 1];
        int bottomRight = arr[row + 2][col + 2];

        return upperLeft + upperMiddle + upperRight + middle + bottomLeft + bottomMiddle + bottomRight;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = maximunHourglassValue(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
