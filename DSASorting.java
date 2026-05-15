import java.util.*;
public class DSASorting{
    public static void main(String[] args){
        var happy =new ArrayList<Integer>();
        happy.add(34);
        happy.add(23);
        happy.add(12);
        happy.add(260);

        Collections.sort(happy);
        System.out.println("The Sorted List is: "+ happy);

    }
}