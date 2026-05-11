import java.util.HashMap;
public class HashMapVar{
    public static void main(String[] args){
        var Test = new HashMap<String , Integer>();
        
        Test.put("Switzerland", 01);
        Test.put("New York", 02);
        Test.put("England",03);
        Test.put("Australia",04);

        for(String i: Test.keySet()){
            System.out.println("Keys: "+ i +"  Values: "+ Test.get(i));
        }

    }
}