import java.util.LinkedList;
import java.util.Collections;
public class SortRverse{
    public static void main(String[] args){


        var happy= new LinkedList<String>();
        happy.add("Annet");
        happy.add("Pandian");
        happy.add("Lovely");
        happy.add("Joyous");

        Collections.sort(happy,Collections.reverseOrder());
        System.out.println(happy);
    
    }
}