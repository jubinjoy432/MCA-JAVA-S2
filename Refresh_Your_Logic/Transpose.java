public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};
        int[][] transpose = new int[2][2];

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                transpose[j][i] = matrix[i][j];

        System.out.println("Transpose of matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(transpose[i][j] + " ");
            System.out.println();
        }
    }
}
