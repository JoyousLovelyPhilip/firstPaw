import java.util.LinkedHashSet;
public class LinkedHashSetLoop{
    public static void main(String[] args){
        var joy = new LinkedHashSet<String>();
        
        joy.add("BBB");
        joy.add("CCC");
        joy.add("DDD");
        joy.add("AAA");
    
        for(String i : joy){
            System.out.println(i);
        }
    }

}