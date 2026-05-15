import java.util.*;
public class IteratorDS{
    public static void main(String[] args){
        var happy =new ArrayList<String>();
        happy.add("Annet");
        happy.add("Pandian");
        happy.add("Pandian");
        happy.add("Lovely");
        happy.add("Joyous");
        int check = Collections.frequency(happy, "Pandian");//op: Dada is repeated by 2times
        System.out.println("Dada is repeated by " + check + " times");

    }
}