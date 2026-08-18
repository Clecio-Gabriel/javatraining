public class SwitchModerno {
    public static void main(String[] args) {
        int opcao = args.length > 0 ? Integer.parseInt(args[0]) : 2;

        String acao = switch (opcao) {
            case 1 -> "cadastrar";
            case 2 -> "consultar";
            case 3 -> "encerrar";
            default -> "opção inválida";
        };

        System.out.println(acao);
    }
}
