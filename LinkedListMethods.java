import java.util.LinkedList;
public class LinkedListMethods{
    public static void main(String[] args){

        LinkedList<String> joy = new LinkedList<String>();
        joy.add("Volvo");
        joy.add("Audi");
        joy.add("BMW");
        joy.add("Rolls Roys");

        joy.addFirst("Joy Car");
        joy.addLast("Annet Car");
        joy.remove("Audi");// removeFirst(), removeLast() methods

        System.out.println(joy.getFirst());//getLast() method is also there
    
    }
}