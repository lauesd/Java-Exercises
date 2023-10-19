package CalculoDeFactorial;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Podrías ingresar un número?: ");
        int resultado = scanner.nextInt();

        BigInteger factorial = BigInteger.ONE;
        int i = 1;

        while (i <= resultado) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
            i++;
        }

        System.out.println("El factorial de: " + resultado + " es: " + factorial);
    }
}
