import java.util.HashMap;
public class HashContainOp{
    public static void main(String[] args){
        HashMap<String, Integer> Cont= new HashMap<String, Integer>();
        Cont.put("Joy", 98);
        Cont.put("Giga", 99);
        Cont.put("Annet",100);
        Cont.put("janu",101);
        Cont.put("mallu ;) ", 102);
        Cont.put("Amala; ", 103);

        if(Cont.containsKey("John")){
            System.out.println("Yes Annet is Present!");
        
        }
        else{
            System.out.println("No This Key is Not Present");
        }
    }
}