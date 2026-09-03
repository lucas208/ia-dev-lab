public class PalindromoEficaz {
    public static boolean ehPalindromo(String texto) {
        if (texto == null) {
            return false;
        }

        int inicio = 0;
        int fim = texto.length() - 1;

        while (inicio < fim) {
            while (inicio < fim && !Character.isLetter(texto.charAt(inicio))) {
                inicio++;
            }

            while (inicio < fim && !Character.isLetter(texto.charAt(fim))) {
                fim--;
            }

            char letraInicio = Character.toLowerCase(texto.charAt(inicio));
            char letraFim = Character.toLowerCase(texto.charAt(fim));

            if (letraInicio != letraFim) {
                return false;
            }

            inicio++;
            fim--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("arara: " + ehPalindromo("arara"));
        System.out.println("Casa: " + ehPalindromo("Casa"));
        System.out.println("Ana: " + ehPalindromo("Ana"));
        System.out.println("frase: " + ehPalindromo("Socorram-me, subi no onibus em Marrocos"));
    }
}
