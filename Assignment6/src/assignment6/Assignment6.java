
package assignment6;

import java.util.Scanner;
public class Assignment6 {

    
    public static void main(String[] args) {
       int card;
       System.out.println("Jill, please select a number from 1 to 10 ");
       Scanner sc=new Scanner(System.in);
       card=sc.nextInt();
       switch(card)
                 {
               case 1:
               System.out.println("Message 1");
               break;
               case 2:
               System.out.println("Message 2");
               break;
               case 3:
               System.out.println("Message 3");
               break;
               case 4:
               System.out.println("Message 4");
               break;
               case 5:
               System.out.println("Message 5");
               break;
               case 6:
               System.out.println("Message 6");
               break;
               case 7:
               System.out.println("Message 7");
               break;
               case 8:
               System.out.println("Message 8");
               break;
               case 9:
               System.out.println("Message 9");
               break;
               case 10:
               System.out.println("Message 10");
               break;
               default:
                   System.out.println("PLease Enter correct number");
       }
       }
       
    }
    

