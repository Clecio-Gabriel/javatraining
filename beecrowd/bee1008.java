import java.util.Scanner;

public class bee1008{

    public static void main(String [] args){

        int id;
        double sal;

        int hours;
        double hr_sal;


        try(Scanner scan = new Scanner(System.in)){
            id = scan.nextInt();
            hours = scan.nextInt();
            hr_sal = scan.nextDouble();
        }

        sal = (double)hours * hr_sal;

        System.out.println(
            "NUMBER = " + id + '\n' +
            "SALARY = U$ " + String.format("%.2f", sal)
        );

    }

}