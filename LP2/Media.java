import java.util.Scanner;


public class Media{

    public static void main(String[] args){
         
        double media;

        double n1;
        double n2;

        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Primeira nota: ");
            n1 = scan.nextDouble();
            System.out.print("Segunda nota: ");
            n2 = scan.nextDouble();
        
            media = (n1 + n2) / 2.0;
            String situacao = (media >= 7.0) ? "Aprovado" : "Em recuperação";
            
            System.out.printf("Média: %.2f - %s%n", media, situacao);

        }

    }

}