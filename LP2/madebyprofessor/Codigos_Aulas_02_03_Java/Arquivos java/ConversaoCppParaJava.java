import java.util.Locale;
import java.util.Scanner;

public class ConversaoCppParaJava {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Primeira nota: ");
            double n1 = entrada.nextDouble();

            System.out.print("Segunda nota: ");
            double n2 = entrada.nextDouble();

            double media = (n1 + n2) / 2.0;
            String situacao = media >= 7.0 ? "Aprovado" : "Em recuperação";

            System.out.printf("Média: %.1f — %s%n", media, situacao);
        }
    }
}
