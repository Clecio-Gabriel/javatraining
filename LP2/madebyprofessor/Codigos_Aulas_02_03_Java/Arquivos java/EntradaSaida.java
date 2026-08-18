import java.util.Scanner;

public class EntradaSaida {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Informe a idade: ");
            int idade = entrada.nextInt();
            System.out.printf("Idade: %d%n", idade);
        }
    }
}
