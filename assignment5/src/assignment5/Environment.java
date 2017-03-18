
package assignment5;
class Animal
{
    public String family;
    public  Animal()
            {
            family="Animal";
             }
}

class fish extends Animal{
    public String Habitat;
    public String Type;
   
     public fish()
            {
                  super();
              Habitat="water";  
              Type="Aquatic";
            } 
    }

class shark extends fish
{
    public String kind;
    public  shark()
{
    super();
    kind="Shark";
}
}
        
public class Environment
{
        public static void main(String[] args)
        {
       shark sk= new shark();
       System.out.println(sk.kind+" is a "+sk.family+" which lives in "+sk.Habitat+",hence it is "+sk.Type);
        }
}
