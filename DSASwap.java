import java.util.*;
public class IteratorDS{
    public static void main(String[] args){
        var happy =new ArrayList<String>();
        happy.add("Annet");
        happy.add("Pandian");
        happy.add("Lovely");
        happy.add("Joyous");
        Collections.swap(happy, 0,2);//op: The Swapped Values are: [Lovely, Pandian, Annet, Joyous]
        System.out.println("The Swapped Values are: "+ happy);

    }
}