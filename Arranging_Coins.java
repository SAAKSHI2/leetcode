class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        while(true)
        {
            if(n<i)
                return i-1;
            n=n-i;
            i++;
        }
    }
}