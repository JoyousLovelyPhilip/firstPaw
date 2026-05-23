public class Test{
    public static void main(String[] args){
        int Age = 34;
        boolean IsCitizen = false;

        if (Age >= 18){
            System.out.println("Your Major , Eligible to Vote");
            if(IsCitizen){
                System.out.println("YOure A citizen you can Vote");
            }
            else{
                System.out.println("Your A Major, but youre not a citizn to vote");
            }
        }
        else{
            System.out.println("Your A minor");
        }
        
    }
}