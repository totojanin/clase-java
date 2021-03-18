package demo;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese N:");
        int n = scanner.nextInt();

        System.out.println("Ingrese M:");
        int m = scanner.nextInt();

        int cont = 0;

        for (int i = 0; cont < n; i++) {
            if (Ejercicio1.esMultiplo(i, m)) {
                System.out.println(i);

                cont++;
            }
        }

        scanner.close();
    }
}
