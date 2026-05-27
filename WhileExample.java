public class dowhileDef{
    public static void main(String[] args){
        int joy = 1;
        while(joy <= 6){
            if(joy < 5){
                System.out.println("The Dice doesnt Exist");
            }
            else{
                System.out.println("Dice");
            }
            joy = joy +1;
        }
    }

}