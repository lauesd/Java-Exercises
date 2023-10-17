package Ejercicios;

import java.util.Scanner;

public class calcularCuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Podrías poner un número para calcularlo al cuadrado?: ");
        int Numero = scanner.nextInt();

        int Cuadrado = Numero * Numero;

        System.out.println("Su calculo es: " + Cuadrado);

    }
}
