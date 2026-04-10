public class TernaryOpMin{
    public static void main(String[] args){
        int a = -34;
        int b = -26;
        int c = 43;

        int min = (a  < b)? (a<c ? a:c) :(b<c  ? b:c);
        System.out.println("The max number is: " + max);
    }
}