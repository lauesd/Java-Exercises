import java.util.Scanner;

public class ZonaEntrada {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cual es tu edad?: ");
        int edad = scanner.nextInt();

        System.out.println("¿Traes cedula?: ");
        String Respuesta = scanner.next();

        if (edad >= 18 && Respuesta.equals("si"))  {
            System.out.println("Puedes entrar a esta zona.");
        } else if (edad <= 18 || Respuesta.equals("no")){
            System.out.println("No puedes pasar a esta zona.");
        } else {
            System.out.println("Ingresastes mal los datos.");
        }

        scanner.close();
    }

}
