public class MaxOfArray{
    public static void main(String[] args) {
        int[] array = {12, 45, 7, 89, 34};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum = " + max);
    }
}