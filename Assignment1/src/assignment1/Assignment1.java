

package assignment1;
import java.util.Scanner;
public class Assignment1 {

        public static void main(String[] args) {
        
         int subjectcount=4;
         float total=0;
         System.out.println("Please enter the marks");
         float subject[]= new float[4];
         for(int i=0;i<4;i++)
         {
             Scanner in=new Scanner (System.in);
            subject[i]=in.nextFloat();
              total=subject[i]+total;
                       }
         float percentage=total/subjectcount;
        
         if(percentage<40)
         {
             System.out.println("Poor");
         }
         else if(percentage>=40 && percentage<60)
         {
             System.out.println("Average");
         }
         else if(percentage>=60 && percentage<80){
             System.out.println("Good");
         }
         else if(percentage>=80 && percentage<90)
         {
             System.out.println("very good");
         }
         else if(percentage>=90)
         {System.out.println("Excellent");
         
         }
         
         
        
       
    }
    
}
