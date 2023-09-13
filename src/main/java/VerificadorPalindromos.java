public class VerificadorPalindromos {

    public static boolean esPalindromoMejorado(String cadena) {
        // Eliminar caracteres especiales y convertir a minúsculas
        String cadenaLimpia = cadena.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Crear una cadena invertida
        StringBuilder palabraInvertida = new StringBuilder(cadenaLimpia).reverse();

        // Comparar la cadena original con la cadena invertida
        return cadenaLimpia.equals(palabraInvertida.toString());
    }


    public static void main(String[] args) {
        String ejemplo1 = "oso";
        String ejemplo2 = "anilina";

        if (esPalindromoMejorado(ejemplo1)) {
            System.out.println(ejemplo1 + " es un palíndromo.");
        } else {
            System.out.println(ejemplo1 + " no es un palíndromo.");
        }

        if (esPalindromoMejorado(ejemplo2)) {
            System.out.println(ejemplo2 + " es un palíndromo.");
        } else {
            System.out.println(ejemplo2 + " no es un palíndromo.");
        }
    }
}
