import java.util.Scanner;

public class Ejercicio4 {
    public Ejercicio4() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(true) {
            System.out.println("Introduce un número entero positivo (un número negativo para terminar): ");
            int num = scanner.nextInt();
            if (num < 0) {
                System.out.println("El número más pequeño es: " + min);
                System.out.println("El número más grande es: " + max);
                return;
            }

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }
    }
}
