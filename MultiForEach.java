public class MultiArray{
    public static void main(String[] args){
        int[][] nums = {{1,22,44},{34,56,78}};
        for(int[] joy: nums){
            for(int rows: joy){
            System.out.println(rows);// output: 1,22,44,34,56,78
            }
        }
    }
}