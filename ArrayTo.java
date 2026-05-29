public class ArraySum{
    public static void main (String[] args){
        int[] nums ={2,4,6,56,7,45};
        int sig = 0;

        for(int i = 0; i < nums.length; i++){
            sig += nums[i];
        }
        System.out.println("The Sum is :" + sig);
    }
}//So when do we use Arrays.toString()? Only when we want: [Joyous, Lovely] in one line.