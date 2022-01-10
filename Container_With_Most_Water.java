class Solution {
    public int maxArea(int[] height) {
        int l=0,h=height.length-1;
        int max=0;
        while(l<h)
        {
          if((Math.min(height[l],height[h])*(h-l))>max)
                    max=Math.min(height[l],height[h])*(h-l);
          if(height[l]<height[h])
               l++;
            else
               h--;
        }
       return max;
    }
}