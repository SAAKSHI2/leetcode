class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
    //    Set<Entry<Integer,Integer>> s=m.entrySet();
        List<Map.Entry<Integer,Integer>> l=new ArrayList<>(m.entrySet());
        Collections.sort(l,new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer,Integer> a,Map.Entry<Integer,Integer> b)
            {
                return b.getValue().compareTo(a.getValue());
            }
        });
        int []ans=new int[k];
        int c=0;
        for(Map.Entry<Integer,Integer> n:l)
        {
            if(k<=0)
                break;
            ans[c++]=n.getKey();
            k--;
        }
        return ans;
    }
}