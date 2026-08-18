public class OlaJava {
    public static void main(String[] args) {
        String nome = args.length > 0 ? args[0] : "turma";
        System.out.printf("Olá, %s!%n", nome);
    }
}
