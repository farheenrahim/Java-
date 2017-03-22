
package assignment10;
import java.util.ArrayList;
import java.util.Iterator;

public class Assignment10 {

    
    public static void main(String[] args) {
        
        ArrayList<String> a= new ArrayList<String>();
        a.add("apple");
        a.add("bananna");
        a.add("cat");
        a.add("dog");
        a.add("elephant");
        System.out.println("The size of array after adding elements: "+ a.size());
       
        for(int i=0;i<a.size();)
        {System.out.println(a.get(i));
        a.remove(i);
        System.out.println("The size of array after removing above item is " + a.size());
               
        }
        
}
    }
    
        
        
        
                
        
        
    
    

