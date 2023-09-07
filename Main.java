public class Main {

        public static boolean esPalindromo(String cadena) {
            StringBuilder palabra_invertida = new StringBuilder();

            // Dividir la cadena en un arreglo de caracteres
            char[] caracteres = cadena.toCharArray();

            // Invertir el arreglo de caracteres
            for (int i = caracteres.length - 1; i >= 0; i--) {
                palabra_invertida.append(caracteres[i]);
            }
            String palabra = palabra_invertida.toString();

            // Comparar la cadena original con la cadena invertida
            return cadena.equals(palabra);
        }    public static void main(String[] args) {
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
