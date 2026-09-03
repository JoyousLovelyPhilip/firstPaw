public class Minmax// joy edits
{
    public static void main(String[] args){
        int[] nums ={239,445,678,89,898,345,234};
        int min = nums[0];
        int max = nums[0];

        for(int i = 0; i < nums.length; i++){
            if (min < nums[i]){
                min = nums[i];
            }
            if(max > nums[i]){
                max = nums[i];
            }
        }
        System.out.println("The Maximum is :" + max);
        System.out.println("the minimum is :" +min);//The Maximum is :89 the minimum is :898
    }
}
