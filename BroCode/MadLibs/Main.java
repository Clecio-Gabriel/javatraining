import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String [] args){
        
        ArrayList<String> adj = new ArrayList<>();
        String noun;
        String verb;

        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter an adjective (description): ");
            adj.add(scan.nextLine());

            System.out.print("Enter a noun (animal or person): ");
            noun = scan.nextLine();

            System.out.print("Enter an adjective (description): ");
            adj.add(scan.nextLine());

            System.out.print("Enter a verb end with -ing (action): ");
            verb = scan.nextLine();

            System.out.print("Enter an adjective (description): ");
            adj.add(scan.nextLine());
        }

        System.out.println("Today I went to a " + adj.get(0) + " zoo.");
        System.out.println("In a exhibit, I saw a " + noun + ".");
        System.out.println(noun + " was " + adj.get(1) + " and " + verb + "!");
        System.out.println("I was " + adj.get(2) + "!");
        
    }

}