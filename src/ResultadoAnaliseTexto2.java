public class ResultadoAnaliseTexto2 {
    private final int palavras;
    private final int caracteres;
    private final int vogais;

    public ResultadoAnaliseTexto2(int palavras, int caracteres, int vogais) {
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
