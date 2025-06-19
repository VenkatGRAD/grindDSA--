package Arrays ;

public class linearSearch {

    public static int linearSearch(int list[] , int key){
        for (int i = 0; i < list.length; i++) {
            if(list[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int list[] = {1,2,3,4,5,6,7,8,9,0};
        int key = 0;
        
        int index = linearSearch(list, key);

        if(index == -1){
            System.out.println("Key not found");
        }else {
            System.out.println("key found at " + index);
        }
        
        
    }
}


