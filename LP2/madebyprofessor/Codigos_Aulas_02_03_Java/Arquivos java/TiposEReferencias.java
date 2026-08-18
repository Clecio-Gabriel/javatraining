public class TiposEReferencias {
    private static final class Pessoa {
        private String nome;

        private Pessoa(String nome) {
            this.nome = nome;
        }
    }

    private static void alterar(int numero, Pessoa pessoa) {
        numero = 99;
        pessoa.nome = "Grace";
        pessoa = new Pessoa("Linus");
        System.out.printf("Dentro do método: numero=%d, pessoa=%s%n", numero, pessoa.nome);
    }

    public static void main(String[] args) {
        int numero = 10;
        Pessoa pessoa = new Pessoa("Ada");

        alterar(numero, pessoa);

        System.out.printf("No chamador: numero=%d, pessoa=%s%n", numero, pessoa.nome);
    }
}
