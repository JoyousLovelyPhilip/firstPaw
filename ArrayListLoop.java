import java.util.ArrayList;
public class ArrayListLoop{
    public static void main(String[] args){
        ArrayList<String> vandis = new ArrayList<String>();
        
        vandis.add("Volvo");
        vandis.add("Audi");
        vandis.add("BMW");
        vandis.add("Rolls Roys");

        for(int i= 0; i< vandis.size(); i++)// instead of length() method we use size() in for loop for setting size limit
        {
            System.out.println(vandis.get(i));
        }

    }
}