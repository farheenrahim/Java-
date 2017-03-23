
package javaapplication12;


public class JavaApplication12 {

     public JavaApplication12(int i)
   {
      System.out.println("First constructor with integer value: "+i);
         }
     public JavaApplication12(float value)
   {
      System.out.println("Second constructor with float value "+value);
         }
   public JavaApplication12()
   {
       System.out.println("Third constructor with no parameters");
   }
  
    public static void main(String[] args) {
        
        JavaApplication12 jv= new JavaApplication12(2);
        JavaApplication12 jv1= new JavaApplication12(2.56f);
        JavaApplication12 jv3= new JavaApplication12();
       
    }
    
}
