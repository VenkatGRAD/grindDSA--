public class trappedRainWater{

    public static int trappedWater(int height[]){
        // minimum bars needed 3
        // sorted array/bars will not store any water 

        // so we need to calculate the left Maximum boundary of the bars  - array
        int n =height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0]; // first bar's lmb is always itself 
        for(int i= 1; i <n ; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // Then we need to calculate right max boundary -array 

        int rightMax[]= new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i-- ){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }


        // loop will calculate..
        // ..the water stored on each bar would be the min(lmb , rmb) - current bar height * width
        int trappedWater= 0;
        for (int i = 0; i <n; i++) {
         int waterLevel = Math.min(leftMax[i], rightMax[i]);
         trappedWater = trappedWater + waterLevel-height[i];
        }

        return trappedWater;

    }
    public static void main(String[] args) {
        int height[] = {4,3,0,2,6,3,2,5};
        System.out.println(trappedWater(height));
    }
}