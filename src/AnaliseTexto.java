public class AnaliseTexto {
    public static Resultado analisar(String texto) {
        if (texto == null || texto.isEmpty()) {
            return new Resultado(0, 0, 0);
        }

        int palavras = 0;
        int vogais = 0;
        boolean dentroDePalavra = false;

        for (int indice = 0; indice < texto.length(); indice++) {
            char caractere = texto.charAt(indice);

            if (Character.isWhitespace(caractere)) {
                dentroDePalavra = false;
            } else if (!dentroDePalavra) {
                palavras++;
                dentroDePalavra = true;
            }

            if (ehVogal(caractere)) {
                vogais++;
            }
        }

        return new Resultado(palavras, texto.length(), vogais);
    }

    private static boolean ehVogal(char caractere) {
        char minusculo = Character.toLowerCase(caractere);
        return minusculo == 'a' || minusculo == 'e' || minusculo == 'i'
                || minusculo == 'o' || minusculo == 'u';
    }

    public static void main(String[] args) {
        Resultado resultado = analisar("Ola, mundo!");
        System.out.println("Palavras: " + resultado.getPalavras());
        System.out.println("Caracteres: " + resultado.getCaracteres());
        System.out.println("Vogais: " + resultado.getVogais());
    }

    public static class Resultado {
        private final int palavras;
        private final int caracteres;
        private final int vogais;

        public Resultado(int palavras, int caracteres, int vogais) {
            this.palavras = palavras;
            this.caracteres = caracteres;
            this.vogais = vogais;
        }

        public int getPalavras() {
            return palavras;
        }

        public int getCaracteres() {
            return caracteres;
        }

        public int getVogais() {
            return vogais;
        }
    }
}
