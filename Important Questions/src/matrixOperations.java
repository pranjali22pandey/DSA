import java.util.Scanner;

public class matrixOperations {




        public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
            int rows = matrixA.length;
            int columns = matrixA[0].length;
            int[][] result = new int[rows][columns];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    result[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }

            return result;
        }

        public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
            int rowsA = matrixA.length;
            int columnsA = matrixA[0].length;
            int columnsB = matrixB[0].length;
            int[][] result = new int[rowsA][columnsB];

            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < columnsB; j++) {
                    for (int k = 0; k < columnsA; k++) {
                        result[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }

            return result;
        }

        public static int[][] transposeMatrix(int[][] matrix) {
            int rows = matrix.length;
            int columns = matrix[0].length;
            int[][] result = new int[columns][rows];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    result[j][i] = matrix[i][j];
                }
            }

            return result;
        }

        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of rows for matrices: ");
            int rows = sc.nextInt();
            System.out.print("Enter the number of columns for matrices: ");
            int columns = sc.nextInt();

            int[][] matrixA = new int[rows][columns];
            int[][] matrixB = new int[rows][columns];

            System.out.println("Enter elements for Matrix A:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrixA[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter elements for Matrix B:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrixB[i][j] = sc.nextInt();
                }
            }

            // Matrix Addition
            System.out.println("Matrix A + Matrix B:");
            int[][] sumMatrix = addMatrices(matrixA, matrixB);
            printMatrix(sumMatrix);

            // Matrix Multiplication
            System.out.println("Matrix A * Matrix B:");
            int[][] productMatrix = multiplyMatrices(matrixA, matrixB);
            printMatrix(productMatrix);

            // Matrix Transposition
            System.out.println("Transpose of Matrix A:");
            int[][] transposeMatrixA = transposeMatrix(matrixA);
            printMatrix(transposeMatrixA);

            sc.close();
        }
    }









