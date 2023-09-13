import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromosTest {

    @Test
    void testEsPalindromoCorto() {
        assertTrue(VerificadorPalindromos.esPalindromoMejorado("radar"));
    }

    @Test
    void testNoEsPalindromo() {
        assertFalse(VerificadorPalindromos.esPalindromoMejorado("hello"));
    }

    @Test
    void testCadenaVacia() {
        assertTrue(VerificadorPalindromos.esPalindromoMejorado(""));
    }

    @Test
    void testConEspacios() {
        assertTrue(VerificadorPalindromos.esPalindromoMejorado("Anita lava la tina"));
    }

    @Test
    void testNumeroEntero() {
        assertTrue(VerificadorPalindromos.esPalindromoMejorado("12321"));
    }

    @Test
    void testUnSoloCaracter() {
        assertTrue(VerificadorPalindromos.esPalindromoMejorado("h"));
    }
}