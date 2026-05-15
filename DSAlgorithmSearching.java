import java.util.*;
public class DSAlgorithmSearching{
    public static void main(String[] args){
        var happy =new ArrayList<String>();
        happy.add("Annet");
        happy.add("Pandian");
        happy.add("Lovely");
        happy.add("Joyous");

        Collections.sort(happy);
        int joy = Collections.binarySearch(happy, "Lovely");
        System.out.println("Hey, Amma is found at index "+joy);

    }
}