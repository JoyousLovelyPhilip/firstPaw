public class SecretNo{
    public static void main(String[] args){
        int[] arr = {5,8,3,9,2,7};
        int sum =0;
        for (int i =0; i <arr.length; i++) {
            if (i % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println("Secret sum = " + sum);
    }
}