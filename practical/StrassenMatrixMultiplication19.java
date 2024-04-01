public class StrassenMatrixMultiplication19 {
    public int[][] multiply(int[][] A, int[][] B) {
        int n = A.length;
        int[][] result = new int[n][n];

        if (n == 1) {
            result[0][0] = A[0][0] * B[0][0];
        } else {
            // Divide matrices into submatrices
            int[][] A11 = new int[n / 2][n / 2];
            int[][] A12 = new int[n / 2][n / 2];
            int[][] A21 = new int[n / 2][n / 2];
            int[][] A22 = new int[n / 2][n / 2];
            int[][] B11 = new int[n / 2][n / 2];
            int[][] B12 = new int[n / 2][n / 2];
            int[][] B21 = new int[n / 2][n / 2];
            int[][] B22 = new int[n / 2][n / 2];

            // Splitting input matrices into submatrices
            splitMatrix(A, A11, 0, 0);
            splitMatrix(A, A12, 0, n / 2);
            splitMatrix(A, A21, n / 2, 0);
            splitMatrix(A, A22, n / 2, n / 2);
            splitMatrix(B, B11, 0, 0);
            splitMatrix(B, B12, 0, n / 2);
            splitMatrix(B, B21, n / 2, 0);
            splitMatrix(B, B22, n / 2, n / 2);

            // Strassen's algorithm
            int[][] M1 = multiply(add(A11, A22), add(B11, B22));
            int[][] M2 = multiply(add(A21, A22), B11);
            int[][] M3 = multiply(A11, subtract(B12, B22));
            int[][] M4 = multiply(A22, subtract(B21, B11));
            int[][] M5 = multiply(add(A11, A12), B22);
            int[][] M6 = multiply(subtract(A21, A11), add(B11, B12));
            int[][] M7 = multiply(subtract(A12, A22), add(B21, B22));

            int[][] C11 = add(subtract(add(M1, M4), M5), M7);
            int[][] C12 = add(M3, M5);
            int[][] C21 = add(M2, M4);
            int[][] C22 = add(subtract(add(M1, M3), M2), M6);

            // Combining submatrices into result matrix
            joinMatrices(C11, result, 0, 0);
            joinMatrices(C12, result, 0, n / 2);
            joinMatrices(C21, result, n / 2, 0);
            joinMatrices(C22, result, n / 2, n / 2);
        }

        return result;
    }

    private int[][] add(int[][] A, int[][] B) {
        int n = A.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    private int[][] subtract(int[][] A, int[][] B) {
        int n = A.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }

    private void splitMatrix(int[][] parent, int[][] child, int startRow, int startCol) {
        for (int i1 = 0, i2 = startRow; i1 < child.length; i1++, i2++)
            for (int j1 = 0, j2 = startCol; j1 < child.length; j1++, j2++)
                child[i1][j1] = parent[i2][j2];
    }

    private void joinMatrices(int[][] child, int[][] parent, int startRow, int startCol) {
        for (int i1 = 0, i2 = startRow; i1 < child.length; i1++, i2++)
            for (int j1 = 0, j2 = startCol; j1 < child.length; j1++, j2++)
                parent[i2][j2] = child[i1][j1];
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] B = {
                {17, 18, 19, 20},
                {21, 22, 23, 24},
                {25, 26, 27, 28},
                {29, 30, 31, 32}
        };

        StrassenMatrixMultiplication19 strassen = new StrassenMatrixMultiplication19();
        int[][] result = strassen.multiply(A, B);
        printMatrix(result);
    }
}
