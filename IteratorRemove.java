import java.util.ArrayList;
import java.util.Iterator;
public class IteratorRemove{
    public static void main(String[] args){
        var happy =new ArrayList<Integer>();
        happy.add(34);
        happy.add(23);
        happy.add(12);
        happy.add(260);

        Iterator<Integer> it = happy.iterator();
        while(it.hasNext()){
        Integer i = it.next();

        if(i > 100){
            it.remove();
        }
        System.out.println(it.next());//so the output would be (the first element , removed element is returned) so answer is [23,260]
        }
        
    }
}