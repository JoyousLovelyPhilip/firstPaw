public class Octsecond{
    public static void main(String[] args){
        int arr[] ={2,3,4,5,6,8,80,8,5};
        boolean found = false; 
        for(int i =0; i< arr.length; i++){
            for(int j = i+1; j< arr.length;j++){

                if ( arr[i] == arr[j]){
                    System.out.println("the Repeated number: "+ arr[i]);
                    found = true;
                    break;
                }
                }
                if(found){
                        break;
                }
            }
            if(!found){
                    System.out.println("No Repeated values found in the array ");
                    
            }
        }
    }

