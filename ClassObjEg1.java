public class ClassObj{
    int x = 34;
    final int y =46;//The final keyword is called a "modifier"
    public static void main(String[] args){
        ClassObj box1 = new ClassObj();
        ClassObj box2 = new ClassObj();
        box1.x= 12;//If you create multiple objects of one class, you can change the attribute values in one object, without affecting the attribute values in the other
        System.out.println(box1.x);
        System.out.println(box2.x);
    }
}