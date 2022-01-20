class Solution {
    public int[][] merge(int[][] intervals) {
      int o[][]=new int[intervals.length][2];  
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] a,int[] b)
            {
                return a[0]-b[0];
            }
        });
        int x=0,c=0;
        o[c][0]=intervals[0][0];
        o[c][1]=intervals[x][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<=intervals[x][1])
            {
                if(intervals[i][1]>o[c][1])
                {
                o[c][1]=intervals[i][1];
                    x=i;
                }
            }
            else
            {
                c++;
                o[c][0]=intervals[i][0];
                x=i;
            }
             o[c][1]=intervals[x][1];
        }
        int oo[][]=new int[c+1][2];
        for(int i=0;i<=c;i++)
            oo[i]=o[i];
        return oo;
        
    }
}