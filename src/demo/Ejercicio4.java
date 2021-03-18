package demo;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese N:");

        int n = scanner.nextInt();
        int cont = 0;

        for(int i = 0; cont < n; i++){
            if(Ejercicio3.esPrimo(i)){
                System.out.println(i);

                cont++;
            }
        }

        scanner.close();
    }
}
