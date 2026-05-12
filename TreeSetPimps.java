import java.util.TreeSet;
public class TreeSetPimps{
    public static void main(String[] args){
        var joy = new TreeSet<String>();
        joy.add("AAA");
        joy.add("BBB");
        joy.add("CCC");
        joy.add("DDD");
    
        if(joy.contains("AAA")){
            System.out.println("Yes it is Present");
        }
        else{
            System.out.println("No it is not Present");
        }
    }
}