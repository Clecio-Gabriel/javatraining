import java.util.Scanner;

public class bee1005{

    public static void main(String[] args){
        double media;
        double A;
        double B;

        try(Scanner scan = new Scanner(System.in)){
            A = scan.nextDouble();
            B = scan.nextDouble();
        }

        media = ((A * 3.5) + (B * 7.5)) / (11);

        System.out.println("MEDIA = " + String.format("%.5f", media));

    }

}