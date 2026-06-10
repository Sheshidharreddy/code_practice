public class FindTheMaxProfitForTheArrayOfPricces {
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        FindTheMaxProfitForTheArrayOfPricces find = new FindTheMaxProfitForTheArrayOfPricces();
        int maxProfit = find.findMaxProfir(prices);
        System.out.println("max profit " +maxProfit);
    }

    public int findMaxProfir(int[] arr){

        int profit = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i -1 ] < arr[i]) {
                profit += arr[i] - arr[i - 1];
            }
        }
        return profit;
    }

}
