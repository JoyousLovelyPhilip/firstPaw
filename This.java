public class This{
    int x;
    
    public This(int x){
    this.x = x*x;//Sometimes a constructor or method has a parameter with the same name as a class variable. When this happens, the parameter temporarily hides the class variable inside that method or constructor. To refer to the class variable and not the parameter, you can use the this keyword
    }
    public static void main(String[] args){
        This Obj = new This(34);
        System.out.println("The num: "+ Obj.x);
    }
}