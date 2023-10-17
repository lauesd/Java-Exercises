package Ejercicios;

import java.util.Scanner;

public class ConsoleInputExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("¿Podrías poner tu nombre?: ");
            String Nombre = scanner.nextLine();

            System.out.println("¿Podrías poner tu apellido?: ");
            String Apellido = scanner.nextLine();

            String nombreCompleto = Nombre + " " + Apellido;
            System.out.println("Hola " + nombreCompleto);
        }
        catch (java.util.InputMismatchException e){
            System.out.println("Ten cuidado con lo que escribes");

        } finally {
            scanner.close();
        }

        }

   }
