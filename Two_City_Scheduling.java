class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,new Comparator<int[]>(){
            public int compare(int []a,int b[])
            {
                return (b[1]-b[0])-(a[1]-a[0]);
            }
        });
        int ans=0;
        for(int i=0;i<costs.length;i++)
        {
            if(i<costs.length/2)
            {
                ans+=(costs[i][0]);
            }
            else
                ans+=costs[i][1];
        }
        return ans;
    }
}