public class Eg2{
    public static void main(String[] args){
         int[] vayasugal ={23,56,76,89,90,32,12,34,63,34};
         int Length= vayasugal.length;
         int Older = vayasugal[0];

         for (int i= 0;i < vayasugal.length;i++){
            if(vayasugal[i]> Older){
                Older = vayasugal[i];
            }
         }
         System.out.println("The Oldest of all Ages:" + Older);// 90
    }
}