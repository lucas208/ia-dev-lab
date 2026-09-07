public class ResultadoAnaliseTexto {
    private final int quantidadePalavras;
    private final int quantidadeCaracteres;
    private final int quantidadeVogais;

    public ResultadoAnaliseTexto(int quantidadePalavras, int quantidadeCaracteres, int quantidadeVogais) {
        this.quantidadePalavras = quantidadePalavras;
        this.quantidadeCaracteres = quantidadeCaracteres;
        this.quantidadeVogais = quantidadeVogais;
    }

    public int getQuantidadePalavras() {
        return quantidadePalavras;
    }

    public int getQuantidadeCaracteres() {
        return quantidadeCaracteres;
    }

    public int getQuantidadeVogais() {
        return quantidadeVogais;
    }
}
