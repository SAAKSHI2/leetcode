class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int o[][]=new int[intervals.length+1][2];
        for(int i=0;i<intervals.length;i++)
            o[i]=intervals[i];
        o[intervals.length]=newInterval;
        Arrays.sort(o,new Comparator<int[]>(){
            public int compare(int a[],int b[])
            {
                return a[0]-b[0];
            }
        });
        int t[][]=new int[intervals.length+1][2];
        int c=0,x=0;
        t[c][0]=o[0][0];
        t[c][1]=o[0][1];
        for(int i=1;i<o.length;i++)
        {
            if(o[i][0]<=o[x][1])
            {
                if(o[i][1]>o[x][1])
                {
                    x=i;
                    t[c][1]=o[x][1];
                }
            }
            else
            {
                c++;
                t[c][0]=o[i][0];
                x=i;
            }
              t[c][1]=o[x][1];
        }
      
        int out[][]=new int[c+1][2];
        for(int i=0;i<=c;i++)
            out[i]=t[i];
        return out;
    }
}