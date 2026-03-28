class Student {
    String name;
    int mark;

    Student(String n,int m) {
        name = n;
        mark = m;
    }
    void display(){
        System.out.println ("student:"+name);
        System.out.println ("Scored:"+mark);
    }
    void result(){
        if(mark >= 50 )
        {
            System.out.println("Result: Passed");
        }
        else{
            System.out.println("Result: Failed");
        }
    }
}
public class Day5{
    public static void main(String[] args)
    {
        Student stu = new Student ("Joyous Lovely Philip",98);
        stu.display ();
        stu.result ();
    }
}
    