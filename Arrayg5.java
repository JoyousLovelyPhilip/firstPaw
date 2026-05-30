public class test{
    public static void main (String[] args){
        int[] expenses = {234,567,789,3456,678,678};
        int totalExp = 0;
        for(int i =0; i< expenses.length; i++){
            totalExp += expenses[i];
        }
        System.out.println("The total Monthly expense is: "+ totalExp);
    }
}