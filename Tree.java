public class Tree{
    public static void main(String[] args){
        int row = 6;
        for (int i = 1; i <= row; i++){
            for (int j = i; j< row; j++ ){
                System.out.print(" ");
            }
            for(int j =1;j<=(2* i-1);j++)//if you add brackets for (i-1)the output changes and the tree might start from 2 not 1.
            {
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i =1; i<=2;i++){

            for(int j =1;j<row;j++){
                System.out.print(" ");
            }
            
            System.out.println("|");
        }
    }
}
