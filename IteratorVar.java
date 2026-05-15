import java.util.ArrayList;
import java.util.Iterator;
public class IteratorDS{
    public static void main(String[] args){
        var happy =new ArrayList<String>();
        happy.add("Annet");
        happy.add("Pandian");
        happy.add("Lovely");
        happy.add("Joyous");

        var it = happy.iterator();//Here, var makes the iterator declaration shorter, but the actual type is still Iterator<String>.

        System.out.println(it.next());

    }
}