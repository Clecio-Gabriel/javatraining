public class OperacoesString {
    public static void main(String[] args) {
        String nome = "  Ada Lovelace  ";
        String limpo = nome.trim();

        System.out.println(limpo.length());
        System.out.println(limpo.toUpperCase());
        System.out.println(limpo.substring(0, 3));
        System.out.printf("Original preservado: >%s<%n", nome);
    }
}
