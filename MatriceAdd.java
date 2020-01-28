// To add two Matrices
public class MatriceAdd {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {2, 4, 6}};
        int[][] matrix2 = {{4, 6, 2}, {6, 2, 5}};
        int[][] matrix3 = new int[2][3];        //sum of matrix1 and matrix2

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(matrix3[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
