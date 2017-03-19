
package assignment7;
import java.util.Scanner;

public class Assignment7 {

    
    public static void main(String[] args) 
    {
        
    float maths;float english;float science;float socialscience ;
    Scanner sc= new Scanner(System.in);
    int select=1;
    do
    {
        do
        {
        System.out.println("Please enter the marks for mathematics");
                 maths=sc.nextFloat();
               }while(maths>100 || maths<=0);
         do
                   {
        System.out.println("Please enter the marks for english");
                 english=sc.nextFloat();
               }while(english>100 || english<=0);
          do
        {
        System.out.println("Please enter the marks for science");
                 science=sc.nextFloat();
               }while(science>100 || science<=0);
         
         do
        {
        System.out.println("Please enter the marks for socialscience");
                 socialscience=sc.nextFloat();
               }while(socialscience>100 || socialscience<=0);
    float total=maths+english+science+socialscience;
    float percentage=total/4;
    if (percentage<40)
    {
        System.out.println("poor");
    }
    else if(percentage>=40 && percentage<60)
    {
        System.out.println("Average");
    }
    else if(percentage>=60 && percentage<80)
    {
        System.out.println("Good");
    }
      else if(percentage>=80 && percentage<90)
    {
        System.out.println("Very Good");
    }  
else if(percentage>=90)
    {
        System.out.println("Excellent");
    }
    System.out.println("Please enter 1 to continue or 0 to exit");
    select=sc.nextInt();
    }while(select!=0);
    }
}
    
        
    
    
