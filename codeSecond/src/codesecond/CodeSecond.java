
package codesecond;
import java.util.*; 
public class CodeSecond {

    public static void main(String[] args) {
            LinkedHashSet<String> set=new LinkedHashSet();  
               set.add("One");    
               set.add("Two");    
               set.add("Three");   
               set.add("Four");  
               set.add("Five");  
            LinkedHashSet<String> set11=new LinkedHashSet(); 
            set11=(LinkedHashSet)set.clone();
            System.out.println(set11);
               Iterator<String> i=set.iterator();  
               while(i.hasNext())  
               {  
               System.out.println(i.next());  
               }  
               System.out.println("The hash set is: " + set); 
               System.out.println(set.remove("Three"));
               System.out.println(set.remove("soham"));
               
    }
    
}
