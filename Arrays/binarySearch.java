
public class binarySearch{

    public static int binarySearch(int arr[] , int key){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if(key == arr[mid]){
                return mid;
            }
            if(key < arr[mid]){
                end = mid-1;
            }
            if(key > arr[mid]){
                start = mid+1;
            }
        }

        return -1;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int key =2;
        int index = binarySearch(arr, key);

        if(index == -1){
            System.out.println("Key not present");
        }else{
            System.out.println("key present at : "+index);
        }
    }
}