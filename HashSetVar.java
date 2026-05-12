import java.util.HashSet;
public class HashSetVar{
    public static void main(String[] args){
        var joy = new HashSet<String>();
        joy.add("AAA");
        joy.add("BBB");
        joy.add("CCC");
        joy.add("DDD");
    
        if(joy.contains("SSS")){
            System.out.println("Yes it is Present");
        }
        else{
            System.out.println("No it is not Present");
        }
    }
}