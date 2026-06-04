public class ConsEg2{
    int MyAge;
    String Myname;
    public ConsEg2(int age, String name)// constructor name must match the class name, he constructor is called when an object of a class is created.
    { 
        MyAge = age;
        Myname = name;//You can have as many parameters as you want:
    }
    public static void main(String[] args){
        ConsEg2 obj = new ConsEg2(22, "Happpy ");
        System.out.println("nam: "+ obj.Myname +" age: "+ obj.MyAge);
    }
}