import java.util.*;
public class IteratorDS{
    public static void main(String[] args){
        var happy =new ArrayList<String>();
        happy.add("Annet");
        happy.add("Pandian");
        happy.add("Lovely");
        happy.add("Joyous");
        Collections.shuffle(happy);//op:The Shuffled Piece:[Joyous, Lovely, Annet, Pandian]
        System.out.println("The Shuffled Piece:" + happy);

    }
}