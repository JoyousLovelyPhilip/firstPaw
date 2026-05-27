public class WhileDef{
    public static void main(String[] args){
        int i = 1;
        while(i < 5 ){
            System.out.println("The Numbers are: " + i);
             i++; // output:The Numbers are: 1 | The Numbers are: 2...
        }//Do not forget to increase the variable used in the condition (i++), otherwise the loop will never end! Do you wonder why we used the letter i in the example above? It's a counter variable and a common choice in simple loops because it's short, traditional, and stands for 'index' or 'iterator'.
    }
}