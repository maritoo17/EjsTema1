import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> multiples = calculateMultiplesOfFive(1, 100);
        int sum = calculateSum(multiples);
        System.out.println("La suma de los múltiplos de 5 entre 1 y 100 es: " + sum);
        System.out.println("Los múltiplos de 5 entre 1 y 100 son: " + multiples);
    }

    public static ArrayList<Integer> calculateMultiplesOfFive (int begin, int end) {
        ArrayList<Integer> multiples = new ArrayList<>();
        for (int i = begin; i <= end; i++) {
            if (i % 5 == 0) {
                multiples.add(i);
            }
        }
        return multiples;
    }

    public static int calculateSum (ArrayList<Integer> array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
