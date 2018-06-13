import java.util.Random;
public class m4 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        System.out.println(matrix.length);
        Random rnd = new Random();
        for (int i = 0; i < 4; i++) {
            for (int J = 0; J < 4; J++) {
                matrix[i][J] = rnd.nextInt(10);
            }
        }
        for (int[] row : matrix) {
            System.out.println();

            for (int item : row) {
                System.out.print(item + ",");
            }

        }
        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j+=2) {
                int tmp =matrix [i][j];
                matrix[i][j] = matrix [i][j+1];
                matrix [i][j+1] = tmp;

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