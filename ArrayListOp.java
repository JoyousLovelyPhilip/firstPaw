import java.util.ArrayList;
public class ArrayListOp{
    public static void main(String[] args){
        ArrayList<String> vandis = new ArrayList<String>();
        
        vandis.add("Volvo");
        vandis.add("Audi");
        vandis.add("BMW");
        vandis.add("Rolls Roys");
        vandis.add(0,"Lamborginni");
        vandis.set(0,"Maaruthi");
        vandis.remove(3);//removes and returns remaining elements
        vandis.size();
        vandis.clear() // clears all and bbecomes null
        //some print statments that works individually
        
        System.out.println(vandis.remove(2));// output : audi
        System.out.println(vandis.get(2));// output: BMW
        System.out.println(vandis.set(0,"Maaruthi"));
    }
}