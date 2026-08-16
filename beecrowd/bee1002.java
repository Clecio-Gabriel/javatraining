import java.util.Scanner;

public class bee1002{
    
    public static void main(String[] args){
        double area;

        double radius;
        double pi = 3.14159;

        try(Scanner scan = new Scanner(System.in)){
            radius = scan.nextDouble();
            area = (radius * radius) * pi;

            System.out.println("A=" + String.format("%.4f", area));
        }

    }

}