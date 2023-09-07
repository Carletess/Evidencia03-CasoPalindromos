public class Main {
    public static void main(String[] args) {
        System.out.println(esPalindromo("reconocer"));
    }
    public static boolean esPalindromo(String cadena) {
        String resultado = "";

        // Dividir la cadena en un arreglo de caracteres
        char[] caracteres = cadena.toCharArray();

        // Invertir la cadena y llenar resultado con los caracteres del arreglo
        for (int i = caracteres.length - 1; i >= 0; i--) {
            resultado += caracteres[i];
        }

        // Comparar la cadena original con la cadena invertida
        return cadena.equals(resultado);
    }
}

