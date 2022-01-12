class Solution {
    public int trap(int[] height) {
        int s=0,m=height[0],index=0;
        for(int i=0;i<height.length;i++)
        {
            if(height[i]>m)
            {
                m=height[i];
                index=i;
            }
        }
        int l=0;
        m=0;
        while(l<index)
        {
            if(height[l]>m)
                m=height[l];
            else
                s+=(m-height[l]);
            l++;
        }
        m=0;
        l=height.length-1;
        while(l>index)
        {
             if(height[l]>m)
                m=height[l];
            else
                s+=(m-height[l]);
            l--;
        }
        return s;
    }
}