import java.util.ArrayList;
import java.util.Iterator;
public class IteratorDS{
    public static void main(String[] args){
        var happy =new ArrayList<String>();
        happy.add("Annet");
        happy.add("Pandian");
        happy.add("Lovely");
        happy.add("Joyous");

        Iterator<String> it = happy.iterator();
        System.out.println(it.next());

    }
}