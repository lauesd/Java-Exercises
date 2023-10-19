package numerosParesImpares;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Podrías ingresar un numero?: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("Ese número es par");
        }else {
            System.out.println("Ese numero es impar");
        }

        scanner.close();


    }
}
