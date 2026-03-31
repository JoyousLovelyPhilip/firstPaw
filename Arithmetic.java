public class Arithmetic {
    public static void main(String[] args)
    {
        int Score = 32;
        int score = 50;

        System.out.println("ur scoree is : " +(Score + score));
        System.out.println("sub : " +(Score - score));
        System.out.println("mul : " +(Score * score));
        System.out.println("div: " +(Score / score));
        System.out.println("modulus:  " +(Score % score));
        System.out.println("AND: "+(Score & score));
        System.out.println("OR: "+(Score | score));
        System.out.println("XOR: "+(Score ^ score));

        if (Score %2 == 0 && score%2 ==0){
            System.out.println("Both the numbers are even");
        }
        else if(Score %2 !=0 && score%2 != 0){
            System.out.println("Both the number are odd");
        }
        else {
            System.out.println("One is ODD and Other is EVEN");
        }
    }
}