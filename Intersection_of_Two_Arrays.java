class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            m.put(nums1[i],1);
        }
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums2.length;i++)
        {
            if(m.containsKey(nums2[i]))
            {
                l.add(nums2[i]);
                m.remove(nums2[i]);
            }
        }
        int a[]=new int[l.size()];
        for(int i=0;i<l.size();i++)
        {
            a[i]=l.get(i);
        }
        return a;
    }
}