import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = getNumbers(scanner);
        double average = calculateAverage(numbers);
        int minimum = findMinimum(numbers);
        int maximum = findMaximum(numbers);
        System.out.println("Media: " + average);
        System.out.println("Mínimo: " + minimum);
        System.out.println("Máximo: " + maximum);
    }

    public static List<Integer> getNumbers(Scanner scanner) {
        List<Integer> numbers = new ArrayList<>();
        int num;
        do {
            System.out.println("Ingrese un número entero (0 para terminar):");
            num = scanner.nextInt();
            if (num != 0) {
                numbers.add(num);
            }
        } while (num != 0);
        return numbers;
    }

    public static double calculateAverage(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.size();
    }

    public static int findMinimum(List<Integer> numbers) {
        int min = numbers.get(0);
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMaximum(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}