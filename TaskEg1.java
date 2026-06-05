public class Large{
    public static void main(String[]  args){
        int[] nums = {2,45,67,34,58,90};
        int lar = nums [0];

        for(int i = 0; i< nums.length; i++){
            if (nums[i] > lar){
                lar = nums[i];
                
            }
        }
        System.out.println("the largest number is " + lar);
    }
}