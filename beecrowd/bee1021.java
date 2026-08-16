import java.util.Scanner;
import java.math.BigDecimal;

public class bee1021{

    public static void main(String[] args){

        BigDecimal input;

        try(Scanner scan = new Scanner(System.in)){
            input = new BigDecimal(scan.nextLine());
            input = input.multiply(new BigDecimal("100.0"));
        }

        int intInp = input.intValue();
        // System.out.println(intInp);

        get_notes(intInp);

    }

    static void get_notes(int val){
        int types[] = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 1};

        int aux = val;
        int div;
        int sub;

        for (int i = 0; i < 11; i++){

            div = aux / types[i];
            sub = div * types[i];

            System.out.println(sub + " " + aux);

            aux -= sub;

            i++;
        }



    }

}