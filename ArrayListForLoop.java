import java.util.ArrayList;
public class ArrayListForLoop{
    public static void main(String[] args){

        var vandis = new ArrayList<String>();
        vandis.add("Volvo");
        vandis.add("Audi");
        vandis.add("BMW");
        vandis.add("Rolls Roys");

        for (int i= 0; i< vandis.size();i++ ){
            System.out.println(vandis.get(i));
        }

    }
}