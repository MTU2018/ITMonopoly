import java.util.Random;

public class massive {
    public static void main(String[] args) {
        int[][] matrix = new int[8][5];
        System.out.println(matrix.length);
        Random rnd = new Random();
        for (int i = 0; i < 8; i++) {
            for (int J = 0; J < 5; J++) {
                matrix[i][J] = rnd.nextInt(10);
            }
        }
        for (int[] row : matrix) {
            System.out.println();

            for (int item : row) {
                System.out.print(item + ",");


            }

        }
    }
}
