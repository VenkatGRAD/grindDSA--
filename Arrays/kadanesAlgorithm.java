public class kadanesAlgorithm {

    public static void kadanes(int arr[]){
        // Sum of the sub arrays in the array 
        // its better to take the negative values as 0 than the negative number 
        // because adding a -ve number to a small -ve number will give negative
        // better to take 0 

        int max= Integer.MIN_VALUE; 
        int curr=0;
        for (int i = 0; i < arr.length; i++) {
            curr = curr + arr[i];
            if( curr < 0){
                curr = 0;
            }
            max = Math.max(curr, max);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[] = {-1,2,-3,4,5,-3};
        
        
    }
}
