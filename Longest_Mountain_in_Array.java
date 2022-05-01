class Solution {
    public int longestMountain(int[] arr) {
        int max=0;
        for(int i=1;i<arr.length;i++)
        {
           if(i+1>arr.length-1)
               return max;
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            {
                int l=i,c=1;
                while(l<arr.length-1)
                {
                    if(arr[l]>arr[l+1])
                    c++;
                    else
                        break;
                    l++;
                }
                l=i;
                while(l>0)
                {
                    if(arr[l-1]<arr[l])
                        c++;
                    else
                        break;
                    l--;
                }
                max=Math.max(max,c);
            }
        }
        return max;
    }
}