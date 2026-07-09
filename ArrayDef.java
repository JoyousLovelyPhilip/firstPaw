import java.util.Arrays;
public class ArrayDef{
    public static void main(String[] args){
        String[] joii = {"Happy","Sad","Angry","Awkward"};
        joii[2] = "Joyous";
        System.out.println("The Element at Index 2 is: " + joii[0]);// always use square braces instead of regular braces
        System.out.println("The Length of the Array is: "+ joii.length);
        System.out.println(Arrays.toString(joii));//regualr println statement is not returning the elelments only returns the Memory referenc so..import Arrays and type toString to print the String
    }
} 
