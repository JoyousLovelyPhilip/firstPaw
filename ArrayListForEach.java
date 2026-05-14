import java.util.ArrayList;
public class ArrayListForEach{
    public static void main(String[] args){
        
        ArrayList<Integer> vandis = new ArrayList <Integer>();

        vandis.add(110801);
        vandis.add(110802);
        vandis.add(110803);
        vandis.add(110804);

        for(Integer i: vandis){
            System.out.println(i);
        }

    }
}