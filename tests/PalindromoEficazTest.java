public class PalindromoEficazTest {
    public static void main(String[] args) {
        verificarVerdadeiro("palindrome phrase", PalindromoEficaz.ehPalindromo(
                "Socorram-me, subi no onibus em Marrocos"));
        verificarVerdadeiro("mixed case", PalindromoEficaz.ehPalindromo("Ana"));
        verificarFalso("non-palindrome", PalindromoEficaz.ehPalindromo("Casa"));
        verificarFalso("null", PalindromoEficaz.ehPalindromo(null));
        verificarVerdadeiro("letterless", PalindromoEficaz.ehPalindromo("!? 123"));
    }

    private static void verificarVerdadeiro(String nome, boolean valor) {
        if (!valor) {
            throw new AssertionError(nome + " expected true");
        }
    }

    private static void verificarFalso(String nome, boolean valor) {
        if (valor) {
            throw new AssertionError(nome + " expected false");
        }
    }
}
