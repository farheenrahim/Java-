
package assignment11;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assignment11 {

    
    public static void main(String[] args) {
        HashMap hashmap= new HashMap();
        hashmap.put(1, "aaple");
        hashmap.put(2, "ball");
        hashmap.put(3, "cat");
        hashmap.put(4, "dog");
        Iterator iterator;
        iterator = hashmap.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry entry=(Map.Entry)iterator.next();
            System.out.print(entry.getKey()+":");
            System.out.print(entry.getValue()+"\n");
        }
    }
    
}
