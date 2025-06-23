public class buyAndSellStocks {

    //Brute force approach
    public static void calcProfit(int prices[]){
        int buyingPrice = Integer.MAX_VALUE;
        int sellingPrice = Integer.MIN_VALUE;;
        int day =0;

        // we need to find the lowest price for buying in the given dates and storing the day 
        for (int i = 0; i < prices.length; i++) {
            if(buyingPrice > prices[i]){
                buyingPrice = prices[i];
                day = i;
            }
        }

        // we need to now find the highest price for selling from the day we bought the stock 
        for (int i = day+1; i < prices.length; i++) {
            if(prices[i] > sellingPrice ){
                sellingPrice = prices[i];
            }
        }
        // calculating profit
        int profit = sellingPrice-buyingPrice;

        // Printing the result
        if(sellingPrice ==0){
            System.out.println("No Profit earned");
        }else{
            System.out.println("Buying price would be: " + buyingPrice +"Rs");
            System.out.println("buying day would be: " + day+" Day");
            System.out.println("selling price would be:" + sellingPrice +"Rs");
            System.out.println(" Profit earned could be : "+profit+"Rs");
        }


        
        
    }

    // optimal approach
    public static int calcProfit2(int prices[]){
        int buyingPrice = Integer.MAX_VALUE;
        int maxprofit = 0; 
        for (int i = 0; i < prices.length; i++) {
            if(buyingPrice < prices[i]){
                int profit = prices[i] - buyingPrice; 
                maxprofit = Math.max(maxprofit, profit);
            }else{
                buyingPrice = prices[i];
            }
        }

        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        calcProfit(prices);
        System.out.println(calcProfit2(prices));
    }
}
