public class ClassEg1{
    public String pop(){
        return "London";
    }
    void num(int population){
         System.out.println("The Population is" + population);
    }
    public static void main(String[] args){
        ClassEg1 myObj = new ClassEg1();
        System.out.println("The people in City :" + myObj.pop());
        myObj.num(450000);

    }
}