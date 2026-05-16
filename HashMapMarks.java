import java.util.HashMap;
public class HashMapMarks{
    public static void main(String[] args){
        HashMap<String, Integer> marks = new HashMap<String, Integer>();

        marks.put("janu",210);
        marks.put("malllu", 350);
        marks.put("giga",370);
        marks.put("dhanseh",80);
        marks.put("abi", 100);
        marks.put("allwi", 340);
        marks.put("puthu", 450);

        System.out.println("The Marks are: " +marks);//the marks are printed
        System.out.println("Mark of Dhanush : " + marks.get("dhanseh"));//danush key value is printed...anyone one o/p only works
    }
}
