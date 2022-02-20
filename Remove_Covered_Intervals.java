class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,new Comparator<int[]>(){
           public int compare(int a[],int b[])
           {
               if(a[0]==b[0])
               {
                 return b[1]-a[1];
               }
               else
                   return a[0]-b[0];
           }
        });
        // for(int i=0;i<intervals.length;i++)
        // {
        //     for(int j=0;j<intervals[0].length;j++)
        //         System.out.println(intervals[i][j]+" ");
        // }
        int x=intervals[0][0];
        int y=intervals[0][1];
        int c=0;
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]>=x && intervals[i][1]<=y)
            {
                c++;
            }
            else
            {
                x=intervals[i][0];
                y=intervals[i][1];
            }
        }
         
        return intervals.length-c;
    }
}