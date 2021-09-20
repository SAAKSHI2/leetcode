class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0],max=0;
        for(int i=1;i<prices.length;i++)
        {
           int x = prices[i]-min;
            if(x>max)
                max=x;
            if(prices[i]<min)
                min=prices[i];
        }
       
        return max;
    }
}