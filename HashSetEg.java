import java.util.HashSet;
public class HashSetEg{
    public static void main(String[] args){
        HashSet<String> joy = new HashSet<String>();
        joy.add("AAA");
        joy.add("BBB");
        joy.add("CCC");
        joy.add("DDD");
    
        joy.remove("BBB");

        for(String i: joy){
            System.out.println(i);
        }
    }
}