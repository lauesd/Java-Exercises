package Adivinanza;


import java.util.Scanner;


public class main {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);


        int numeroSecreto = (int) (Math.random() * 100) + 1;

        int numeroIngresado;

        int intentos = 0;

        boolean adivinado = false;


        System.out.println("¡Se bienvenida como persona al juego de adivinanza!");
        System.out.println("Intenta adivinar el número secreto entre 1 y 100.");


        while (!adivinado) {
            System.out.print("Ingresa un número: ");
            numeroIngresado = scanner.nextInt();

            intentos++;

            if (numeroIngresado == numeroSecreto) {
                adivinado = true;
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
            } else if (numeroIngresado < numeroSecreto) {
                System.out.println("El número ingresado es demasiado bajo. Intenta nuevamente.");
            } else {
                System.out.println("El número ingresado es demasiado alto. Intenta nuevamente.");
            }
        }


        scanner.close();
    }
}
