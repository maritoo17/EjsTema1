import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int [][] tables = calculateMultiplicationTables(10);
        for (int i = 0; i < tables.length; i++) {
            System.out.println ("Tabla de multiplicar del número " + i + ": " + Arrays.toString(tables[i]));
        }
    }

    public static int [][] calculateMultiplicationTables (int N) {
        int [][] tables = new int [N][10];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 10; j++) {
                tables[i][j] = i * j;
            }
        }
        return tables;
    }
}
