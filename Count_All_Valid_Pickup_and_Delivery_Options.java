class Solution {
    public int countOrders(int n) {
        long ans=1;
        int s=n*2;
        for(int i=0;i<n;i++)
        {
            ans=(ans*(s*(s-1))/2)%((int)Math.pow(10,9)+7);
            s=s-2;
        }
        return (int)ans;
    }
}