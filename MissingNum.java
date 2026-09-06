public class MissingNum {
    public static void main(String[] args){
        int[] arr = {6, 7, 9, 11};
        int n= 5;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum =sum + arr[i];
        }
        int missing = total-sum;
        System.out.println("Missing number = " + missing);
    }
}