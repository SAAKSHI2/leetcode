class Solution {
    public void sortColors(int[] nums) {
       int a[]=new int[3];
           for(int i=0;i<nums.length;i++)
           {
               a[nums[i]]++;
           }
        int x=0;
        for(int i=0;i<nums.length;)
        {
            if(a[x]>0)
            {
            nums[i]=x;
            a[x]--;
               i++;
            }
            else
                x++;
        }
    }
}