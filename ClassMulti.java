public class ClassMulti//Remember from the Java Syntax chapter that a class should always start with an uppercase first letter, and that the name of the java file should match the class name.
{
    int joy = 21;
    int ann = 22;
    int we = joy+ ann;
    public static void main(String[] args){
        ClassMulti obj = new ClassMulti();
        System.out.println(obj.joy);//21
        System.out.println(obj.ann);//22
        System.out.println(obj.we);//43

    }
}
