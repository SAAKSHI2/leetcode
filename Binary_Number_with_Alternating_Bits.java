class Solution {
    public boolean hasAlternatingBits(int n) {
        int x=-1;
        // while(n>0)
        // {
        //     int r=n%2;
        //     if(x==r)
        //         return false;
        //     x=r;
        //     n=n/2;
        // }
        // return true;
        while(n>0)
        {
            int r=n&1;
            if(r==x)
                return false;
            x=r;
            n=n>>1;   
        }
        return true;
    }
}