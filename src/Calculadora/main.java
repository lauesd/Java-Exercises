package Calculadora;


import java.util.Scanner;


public class main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;
        String operacion;


        System.out.print("Ingrese el primer número ");
        num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();

        System.out.print("Ingrese la operación (+, -, *, /): ");
        operacion = scanner.next();


        switch (operacion) {
            case "+":
                resultado = num1 + num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println("El resultado es: " + resultado);
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("El resultado es: " + resultado);
                } else {
                    System.out.println("No se puede dividir por cero. ");
                }
                break;
            default:
                System.out.println("Operación inválida.");
        }
    }
}