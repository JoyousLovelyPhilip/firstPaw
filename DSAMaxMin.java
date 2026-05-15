import java.util.*;
public class DSALoop{
    public static void main(String[] args){
        var happy =new ArrayList<Integer>();
        happy.add(34);
        happy.add(23);
        happy.add(12);
        happy.add(12);
        happy.add(260);

        System.out.println("max: "+ Collections.max(happy));
        System.out.println("Min: " + Collections.min(happy));
    }
}