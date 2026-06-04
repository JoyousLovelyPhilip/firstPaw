public class thiis{
    int MyAge;
    String Myname;
    public thiis(int age, String Myname)
    { 
        MyAge = age;
        this.Myname = Myname;//Think of this.x = x; as: "this.x (the class variable) gets the value of x (the parameter)." Without this, the code above x = x; would set the parameter x equal to itself, and the class variable would stay uninitialized (0).

    }
    public static void main(String[] args){
        thiis obj = new thiis(22, "Happpy ");
        System.out.println("name: "+ obj.Myname +" age: "+ obj.MyAge);
    }
}