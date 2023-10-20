package ComprarTienda;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Esto es una tienda de computadoras, presiona ok para continuar");
        String Respuesta1 = scanner.next();

        if (Respuesta1.equals("ok")){
            System.out.println("¿Te gustaría comprar un pc Lenovo?");
            String Respuesta2 = scanner.next();

            if (Respuesta2.equals("si")){
                System.out.println("Serían 100 dolares");
            } else {
                System.out.println("Reinicia la aplicación para continuar.");
            }
        } else {
            System.out.println("Reinicia la aplicación para continuar.");
        }

    scanner.close();
    }
}
