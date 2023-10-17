package Ejercicios;

public class Palíndromo {
    public static boolean esPalindromo(String cadena) {
        cadena = cadena.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int izquierda = 0;
        int derecha = cadena.length() - 1;

        while (izquierda < derecha) {
            if (cadena.charAt(izquierda) != cadena.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }

    public static void main(String[] args) {
        String entrada = "Anita lava la tina";
        System.out.println(esPalindromo(entrada));
    }
}
