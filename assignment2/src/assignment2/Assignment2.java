
package assignment2;
import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        
        float michaelprice,bruceprice;
        System.out.println("Plese enter Bruce bid price");
        Scanner sc= new Scanner(System.in);
        bruceprice=sc.nextFloat();
        System.out.println("Plese enter Michael bid price");
        michaelprice=sc.nextFloat();
        if(bruceprice>michaelprice){
            System.out.println("Bruce won the bid for the property");
        }
            else if(michaelprice>bruceprice){
            System.out.println("Michael won the bid for the property");
        }
            else if(bruceprice==michaelprice)
                {
            System.out.println("Michael and Bruce bid for the same price. Nobody wins");
        }
    }
    
}
