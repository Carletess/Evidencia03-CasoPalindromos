package org.example;
public class Main {

    public static boolean esPalindromo(String palabraIngresada) {
        palabraIngresada = palabraIngresada.replace(" ", "");

        StringBuilder stringBuilder = new StringBuilder(palabraIngresada);
        String palabraInvertida = stringBuilder.reverse().toString();

        return palabraIngresada.equalsIgnoreCase(palabraInvertida);
    }
    public static void main(String[] args) {
        String ejemplo1 = "oso";
        String ejemplo2 = "anilina";

        if (esPalindromo(ejemplo1)) {
            System.out.println(ejemplo1 + " es un palíndromo.");
        } else {
            System.out.println(ejemplo1 + " no es un palíndromo.");
        }

        if (esPalindromo(ejemplo2)) {
            System.out.println(ejemplo2 + " es un palíndromo.");
        } else {
            System.out.println(ejemplo2 + " no es un palíndromo.");
        }
    }
}
