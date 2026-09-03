public class PalindromoEficazTest {
    public static void main(String[] args) {
        verificarPalindromos();
        System.out.println("PalindromoEficazTest: OK");
    }

    private static void verificarPalindromos() {
        assertTrue(PalindromoEficaz.ehPalindromo("Ana"), "Deve aceitar capitalizacao variada");
        assertTrue(
            PalindromoEficaz.ehPalindromo("A base do teto desaba"),
            "Deve aceitar a frase palindroma"
        );
        assertTrue(
            PalindromoEficaz.ehPalindromo("A torre da derrota!"),
            "Deve ignorar pontuacao"
        );
        assertFalse(PalindromoEficaz.ehPalindromo("Casa"), "Deve rejeitar nao palindromos");
        assertFalse(PalindromoEficaz.ehPalindromo(null), "Null deve retornar false");
        assertTrue(PalindromoEficaz.ehPalindromo(""), "Texto vazio deve retornar true");
        assertTrue(
            PalindromoEficaz.ehPalindromo("!?. 123"),
            "Texto sem letras deve retornar true"
        );
    }

    private static void assertTrue(boolean condicao, String mensagem) {
        if (!condicao) {
            throw new AssertionError(mensagem);
        }
    }

    private static void assertFalse(boolean condicao, String mensagem) {
        assertTrue(!condicao, mensagem);
    }
}
