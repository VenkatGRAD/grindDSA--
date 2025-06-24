public class bubbleSort {

    public static void bubbleSort(int arr[]){
        
        // i is number of turns it will compare so 5 with 4 , 5 with 1, 5 with 3, 5 with 2
        for (int i = 0; i < arr.length-1; i++) { // length - 1 as last number need not be compared with any number 
            // decreasing the number of turn as i after every turn 
               for (int j = 0; j < arr.length-1-i; j++) {
                    if (arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1]= temp;
                    }
               }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        bubbleSort(arr);
    }
}