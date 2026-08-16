import java.util.Scanner;

public class Main{

    public static void main(String [] args){


        double area;
        double height;
        double width;

        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Height of the Rectangle: ");
            height = scan.nextDouble();

            System.out.print("Width of the Rectangle: ");
            width = scan.nextDouble();

            area = height * width;

            System.out.println("The area of your rectangle is " + area);

        }

    }

}