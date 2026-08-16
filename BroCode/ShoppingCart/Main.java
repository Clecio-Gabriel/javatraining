import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        String item;
        double price;
        int qnt;
        String currency = "R$";

        double total;

        try(Scanner scan = new Scanner(System.in)){
            System.out.print("What item would you like to buy?: ");
            item = scan.nextLine();

            System.out.print("What is the price for each?: ");
            price = scan.nextDouble();

            System.out.print("How many would you like?: ");
            qnt = scan.nextInt();
        }

        total = price * (double)qnt;

        System.out.println(
            "\nYou have bought " + qnt + " " + item + "/s\n" + 
            "Your total is " + currency + " " + String.format("%.2f", total)
        );

    }

}