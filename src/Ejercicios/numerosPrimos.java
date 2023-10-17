package Ejercicios;

public class numerosPrimos {
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return  false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int entrada = 7;
        System.out.println(esPrimo(entrada));
    }
}
