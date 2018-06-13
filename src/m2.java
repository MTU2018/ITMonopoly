import java.util.Random;

public class m2 {

    public static void main(String[] args) {
        int[][] matrix = new int[8][5];
        Random rnd = new Random();
        for (int i = 0; i < 8; i++) {
            for (int J = 0; J < 5; J++) {
                matrix[i][J] = rnd.nextInt(300) - 150;
            }
        }
        for (int[] row : matrix) {
            System.out.println();

            for (int item : row) {
                System.out.print(item + ",");
            }
        }
        int[] maxs = new int[5];
        for (int i = 0; i < 5; i++) {
            maxs[i] = matrix [i][0];
            int maxj = 0;
            for (int j = 0; j < 8; j++) {
                if (matrix[i][j] > maxs[i]) {
                    maxs[i] = matrix[i][j];
                    maxj = j;
                }
            }

            matrix [i][maxj] = matrix [i][0];
            matrix [i][0] = maxs [i];
        }
        System.out.println("Result:");
        for (int[] row : matrix) {
            System.out.println();

            for (int item : row) {
                System.out.printf("%5d", item);
            }
            System.out.println();

            System.out.println("Maximus");
            for (int item : maxs) {
                System.out.println();


    }}}}
