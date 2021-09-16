class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a[]=new int[2];
        for(int i=0;i<numbers.length;i++)
        {
           
            int j=i+1;
            while(j<numbers.length)
            {
               if(numbers[i]+numbers[j]==target)
               {
                   a[0]=i+1;
                   a[1]=j+1;
                   return a;
               }
                if(numbers[i]+numbers[j]>target)
                    break;
                j++;
            }
        }
        return a;
    }
}