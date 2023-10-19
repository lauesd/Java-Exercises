package OrdenamientoDeNumeros;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Podrías ingresar la cantidad de números a ordenar?: ");
        int cantidadNumeros = scanner.nextInt();

        int[] numeros = new int[cantidadNumeros];
        System.out.println("¿Podrías ingresar los números separados por espacio?: ");
        for (int i = 0; i < cantidadNumeros; i++) {
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        System.out.print("Numeros ordenados en orden ascendente: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        scanner.close();
    }
}
