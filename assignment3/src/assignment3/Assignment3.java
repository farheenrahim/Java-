
package assignment3;

class class1 {
    
    public void multiply(int a, int b)
    {
        int result=a*b;
         System.out.println("The  values were int :");
        System.out.println("The result is "+result);
    }
    public void multiply(float a,float b)
    {
        float answer= a*b;
        System.out.println("The values were Floats :");
        System.out.println("The result is "+answer);
    }
}
public class Assignment3 extends class1 {

    
    public static void main(String[] args) {
        class1 c=new class1();
        c.multiply(2,3);
        c.multiply(2.0f,3.4f);
       
    }
    
}
