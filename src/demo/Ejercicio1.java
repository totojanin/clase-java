package demo;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero n: ");

        int n = scanner.nextInt();

        int i = 0;
        int cont = 0;

        while (cont < n) {
            if (esMultiplo(i, 2)) {
                System.out.println(i);

                cont++;
            }

            i++;
        }

        scanner.close();
    }

    public static boolean esMultiplo(int n, int m) {
        return n % m == 0;
    }
}
