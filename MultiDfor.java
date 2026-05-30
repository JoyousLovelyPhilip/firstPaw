public class MultiDimention{
    public static void main(String[] args){
        int[][] ids = {{2,3,4,5},{6,7,8,9,1,34,56}};
        for(int row = 0; row < ids.length; row++){
            for(int col = 0; col<ids[row].length; col++){
                System.out.println("["+ row+ "] ["+ col+ "]"+ ids[row][col]);
            }
        }
    }
}