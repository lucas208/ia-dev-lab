public class AnalisadorTexto {
    public static ResultadoAnaliseTexto analisar(String texto) {
        if (texto == null) {
            texto = "";
        }

        int quantidadePalavras = contarPalavras(texto);
        int quantidadeCaracteres = texto.length();
        int quantidadeVogais = contarVogais(texto);

        return new ResultadoAnaliseTexto(
            quantidadePalavras,
            quantidadeCaracteres,
            quantidadeVogais
        );
    }

    private static int contarPalavras(String texto) {
        String textoSemEspacosExcedentes = texto.trim();
        if (textoSemEspacosExcedentes.isEmpty()) {
            return 0;
        }

        return textoSemEspacosExcedentes.split("\\s+").length;
    }

    private static int contarVogais(String texto) {
        int quantidadeVogais = 0;

        for (int indice = 0; indice < texto.length(); indice++) {
            if (ehVogal(texto.charAt(indice))) {
                quantidadeVogais++;
            }
        }

        return quantidadeVogais;
    }

    private static boolean ehVogal(char caractere) {
        char letra = Character.toLowerCase(caractere);
        return "aeiouáàâãéêíóôõúü".indexOf(letra) >= 0;
    }
}
