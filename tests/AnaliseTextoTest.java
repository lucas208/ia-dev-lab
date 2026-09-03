public class AnaliseTextoTest {
    public static void main(String[] args) {
        verificar("punctuation", AnaliseTexto.analisar("Ola, mundo!"), 2, 11, 4);
        verificar("mixed case", AnaliseTexto.analisar("AeIoU"), 1, 5, 5);
        verificar("mixed whitespace", AnaliseTexto.analisar("  um\tdois\n tres  "), 3, 17, 4);
        verificar("punctuation word", AnaliseTexto.analisar("..."), 1, 3, 0);
        verificar("empty", AnaliseTexto.analisar(""), 0, 0, 0);
        verificar("whitespace only", AnaliseTexto.analisar(" \t\n"), 0, 3, 0);
        verificar("null", AnaliseTexto.analisar(null), 0, 0, 0);
    }

    private static void verificar(String nome, AnaliseTexto.Resultado resultado,
                                  int palavras, int caracteres, int vogais) {
        if (resultado.getPalavras() != palavras
                || resultado.getCaracteres() != caracteres
                || resultado.getVogais() != vogais) {
            throw new AssertionError(nome + " has unexpected counts");
        }
    }
}
