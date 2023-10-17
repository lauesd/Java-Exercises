package SumaNumeros;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar el primer número entero
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        // Solicitar al usuario ingresar el segundo número entero
        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        // Calcular la suma de los dos números
        int suma = numero1 + numero2;

        //Imprimir el resultado de la suma
        System.out.println("La suma de los dos números es: " + suma);

        scanner.close(); // Cerrar el objeto Scanner
    }
}
