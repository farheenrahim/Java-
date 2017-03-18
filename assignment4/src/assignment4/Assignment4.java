
package assignment4;
class class1 {
    
    public void multiply(int a, int b)
    {
        int result=a+b;
         System.out.println("The  values were int :");
        System.out.println("The result is "+result);
    }}

public class Assignment4 extends class1 {
       public static void main(String[] args) {
           Assignment4 c=new Assignment4();
           c.multiply(8, 4);
       }
           @Override
    public void multiply(int a,int b)
    {
        int answer= a*b;
        System.out.println("The values were Floats :");
        System.out.println("The result is "+answer);
    }
        // TODO code application logic here
    }
    

