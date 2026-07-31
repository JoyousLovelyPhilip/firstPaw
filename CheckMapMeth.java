import java.util.HashMap;
public class CheckMapMeth{
    public static void main(String[] args){
        HashMap<String, String> JoyTry = new HashMap<String, String>();
        JoyTry.put("Joyous"," Happiness");
        JoyTry.put("Annet","The First Fruit");
        JoyTry.put("Lovely","Loveliest to Soul");
        JoyTry.put("Philip V Pandian", "oopsie! I dono the meaning, but Absolutely the Ruler of Our Family nxt to God");

        JoyTry.remove("Joyous");//joy or when the key is misspelled it will give out a error
        JoyTry.clear();
        System.out.println("THE HASHMAP SAMPLE:" + JoyTry.size());

       /* the  get method can be used in the print statment,but if you print same remove() method in the print Statement , it returns the removed element not the whole elements are printed, so if you want an output after an removing a particular element ...use remove() method before print statement as shown*/  
    }
}
