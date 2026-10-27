import java.util.*;
public class DSALoop{
    public static void main(String[] args){
        var happy =new ArrayList<Integer>();
        happy.add(35);
        happy.add(21);
        happy.add(26);
        happy.add(45);

        var it = happy.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
