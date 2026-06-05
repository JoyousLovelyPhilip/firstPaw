class Student{
    int age ;
    String name;

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age:" + age);
    } //for now op is not given coz of some directory issues
}
public class demo{ 
    public static void main(String[] args){
            Student obj =new Student();
            obj.age = 23;
            obj.name = "Joyous";
    }
    
}