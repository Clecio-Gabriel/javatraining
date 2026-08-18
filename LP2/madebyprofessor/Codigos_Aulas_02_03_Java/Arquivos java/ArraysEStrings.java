public class ArraysEStrings {
    public static void main(String[] args) {
        int[] valores = {2, 4, 6, 8};
        int soma = 0;

        for (int valor : valores) {
            soma += valor;
        }

        double media = (double) soma / valores.length;
        String mensagem = "Média do array";
        System.out.printf("%s: %.1f%n", mensagem, media);
    }
}
