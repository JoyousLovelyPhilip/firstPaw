public class Forrest{
    public static void main(String[] args){
    int a= 6;
    int b= 5;

    if(a>b) {
        System.out.println("A is Greater");
    }
    if(b<a){
        System.out.println("B is greater");
    }
    if (a % 2 ==0 && b%2 ==0){
        System.out.println("both are even");
    }
    if(a % 2 !=0 && b%2 !=0){
        System.out.println("Any one is odd");
    }
    if(a==b){
        System.out.println("Both are Equal");
    }
    System.out.println("AND:" +(a & b));
    System.out.println("OR:" +(a | b));
    System.out.println("XOR:" +(a ^ b));
    if (a < 0 || a > 100 || b < 0 || b > 100) {
        System.out.println("Out of range");
    }

}
}