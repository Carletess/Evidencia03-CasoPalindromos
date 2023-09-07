package org.example;

public class Main {
    public static void main(String[] args) {
        String palindromo = "Reconocer";

        System.out.println(esPalindromo(palindromo));
    }

    public static boolean esPalindromo(String palabraIngresada) {
        palabraIngresada = palabraIngresada.replace(" ", "");

        StringBuilder frase = new StringBuilder(palabraIngresada);
        String palabraInvertida = frase.reverse().toString();

        return palabraIngresada.equalsIgnoreCase(palabraInvertida);
    }
}