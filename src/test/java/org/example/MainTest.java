package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void esPalindromo() {
        // Caso de prueba: Palabra que es un palíndromo
        assertTrue(Main.esPalindromo("oso"));

        // Caso de prueba: Palabra que no es un palíndromo
        assertFalse(Main.esPalindromo("hola"));

        // Caso de prueba: Frase que es un palíndromo
        assertTrue(Main.esPalindromo("anita lava la tina"));

        // Caso de prueba: Palabra con números que es un palíndromo
        assertTrue(Main.esPalindromo("12321"));

        // Caso de prueba: Texto vacío
        assertTrue(Main.esPalindromo(""));

        // Caso de prueba: Texto con solo espacios
        assertTrue(Main.esPalindromo("   "));
    }

}
