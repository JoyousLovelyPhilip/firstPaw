class  Modie{
    public String name = "gig";
    private int age = 34;
    
}
public class domi{
    public static void main(String[] args){
        Modie obj = new Modie();
        System.out.println("name is : "+ obj.name);
        //System.out.println("age: "+ obj.age);//error: age has private access in dom
    }
}