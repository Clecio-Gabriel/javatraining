public class ControleFluxo {
    public static void main(String[] args) {
        int limite = args.length > 0 ? Integer.parseInt(args[0]) : 5;
        int soma = 0;

        for (int i = 1; i <= limite; i++) {
            soma += i;
        }

        if (soma > 10) {
            System.out.printf("Soma alta: %d%n", soma);
        } else {
            System.out.printf("Soma baixa: %d%n", soma);
        }
    }
}
