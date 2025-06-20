public class largestInArray {

    // Taking a minimum value to compare with the values in array;
    // whenever arr element is larger than the max value it updates the max variable; 

    public static int largest(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    } 
    public static void main(String[] args) {
        int arr[]= {100,2000,3,40,5,6,7,89};
        System.out.println(largest(arr));
    }
}
