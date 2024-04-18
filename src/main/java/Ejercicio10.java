import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la dimensión de la matriz:");
        int dimension = scanner.nextInt();
        generateAndPrintSymmetricMatrix(dimension);
    }

    public static void generateAndPrintSymmetricMatrix(int dimension) {
        Random random = new Random();
        int[][] matrix = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = i; j < dimension; j++) {
                int randomNum = random.nextInt(100);
                matrix[i][j] = randomNum;
                matrix[j][i] = randomNum;
            }
        }
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}