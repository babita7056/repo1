//13.Write a program to perform matrix manipulation operations like addition, subtraction, multiplication, and transpose. Also finding the determinant and inverse of a matrix. The program should take random matrices as input and display the result of the operations.

package MethodLevel3;
import java.util.Scanner;
public class MatrixManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows for Matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter number of columns for Matrix A: ");
        int colsA = scanner.nextInt();
        System.out.print("Enter number of rows for Matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter number of columns for Matrix B: ");
        int colsB = scanner.nextInt();

        int[][] matrixA = generateRandomMatrix(rowsA, colsA);
        int[][] matrixB = generateRandomMatrix(rowsB, colsB);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        System.out.println("Matrix B:");
        displayMatrix(matrixB);

        if (rowsA == rowsB && colsA == colsB) {
            int[][] sum = addMatrices(matrixA, matrixB);
            System.out.println("Sum of A and B:");
            displayMatrix(sum);

            int[][] difference = subtractMatrices(matrixA, matrixB);
            System.out.println("Difference of A and B:");
            displayMatrix(difference);
        } else {
            System.out.println("Addition and Subtraction not possible due to dimension mismatch.");
        }

        if (colsA == rowsB) {
            int[][] product = multiplyMatrices(matrixA, matrixB);
            System.out.println("Product of A and B:");
            displayMatrix(product);
        } else {
            System.out.println("Multiplication not possible due to dimension mismatch.");
        }

        int[][] transposeA = transposeMatrix(matrixA);
        System.out.println("Transpose of Matrix A:");
        displayMatrix(transposeA);
        int[][] transposeB = transposeMatrix(matrixB);
        System.out.println("Transpose of Matrix B:");
        displayMatrix(transposeB);
        if (rowsA == colsA && rowsA == 2) {
            double detA = determinant2x2(matrixA);
            System.out.println("Determinant of Matrix A: " + detA);
            if (detA != 0) {
                double[][] inverseA = inverse2x2(matrixA);
                System.out.println("Inverse of Matrix A:");
                displayMatrix(inverseA);
            } else {
                System.out.println("Matrix A is singular, no inverse exists.");
            }
        } else {
            System.out.println("Determinant and Inverse for Matrix A not possible (only 2x2 supported).");
        }
        if (rowsB == colsB && rowsB == 2) {
            double detB = determinant2x2(matrixB);
            System.out.println("Determinant of Matrix B: " + detB);
            if (detB != 0) {
                double[][] inverseB = inverse2x2(matrixB);
                System.out.println("Inverse of Matrix B:");
                displayMatrix(inverseB);
            } else {
                System.out.println("Matrix B is singular, no inverse exists.");
            }
        } else {
            System.out.println("Determinant and Inverse for Matrix B not possible (only 2x2 supported).");
        }
        scanner.close();

}

    public static int[][] generateRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10); 
            }
        }
        return matrix;
    }
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
    public static double determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }
    public static double[][] inverse2x2(int[][] matrix) {
        double det = determinant2x2(matrix);
        if (det == 0) throw new IllegalArgumentException("Matrix is singular, no inverse exists.");
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] = matrix[0][0] / det;
        return inverse;
    }
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f\t", val);
            }
            System.out.println();
        }
    }
}

