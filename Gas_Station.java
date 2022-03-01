class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int c=0,s=0,t=0;
        for(int i=0;i<cost.length;i++)
        {
            t+=gas[i]-cost[i];
            c+=gas[i]-cost[i];
            if(c<0)
            {
                c=0;
                s=i+1;
            }
        }
        
        return t>=0?s:-1;
    }
}