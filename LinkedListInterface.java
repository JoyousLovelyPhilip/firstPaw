import java.util.List;
import java.util.LinkedList;
public class LinkedListInterface{
    public static void main(String[] args){


        List<String> happy= new LinkedList<String>();
        happy.add("Philip");//So therefore LinkedList and also ArrayList can store Duplicates but main Purpose of it is Manipulation
        happy.add("Philip");
        happy.add("Lovely");
        happy.add("Annet");
    
        System.out.println(happy);
    
    }
}