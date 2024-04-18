import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la dimensión de los vectores:");
        int dimension = scanner.nextInt();
        int[] vector1 = getVector(scanner, dimension);
        int[] vector2 = getVector(scanner, dimension);
        int dotProduct = calculateDotProduct(vector1, vector2);
        System.out.println("El producto escalar de los vectores es: " + dotProduct);
    }

    public static int[] getVector(Scanner scanner, int dimension) {
        int[] vector = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            System.out.println("Ingrese el elemento " + (i + 1) + " del vector:");
            vector[i] = scanner.nextInt();
        }
        return vector;
    }

    public static int calculateDotProduct(int[] vector1, int[] vector2) {
        int dotProduct = 0;
        for (int i = 0; i < vector1.length; i++) {
            dotProduct += vector1[i] * vector2[i];
        }
        return dotProduct;
    }
}