import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las dimensiones de las matrices:");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        System.out.println("Ingrese los valores de la primera matriz:");
        int[][] matrix1 = getMatrix(scanner, rows, cols);
        System.out.println("Ingrese los valores de la segunda matriz:");
        int[][] matrix2 = getMatrix(scanner, cols, rows);
        int[][] result = multiplyMatrices(matrix1, matrix2);
        if (result != null) {
            System.out.println("Primera matriz:");
            printMatrix(matrix1);
            System.out.println("Segunda matriz:");
            printMatrix(matrix2);
            System.out.println("Resultado de la multiplicación:");
            printMatrix(result);
        } else {
            System.out.println("Las dimensiones de las matrices no son compatibles para la multiplicación.");
        }
    }

    public static int[][] getMatrix(Scanner scanner, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Ingrese el valor en la posición (" + (i + 1) + ", " + (j + 1) + "):");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            return null;
        }

        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}