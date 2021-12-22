class Solution {
    void merge(int l,int r,int []n)
    {
        if(l<r)
        {
            int m=l+((r-l)/2);
            merge(l,m,n);
            merge(m+1,r,n);
            merging(l,r,n,m);
        }
    }
    void merging(int l,int r,int n[],int m)
    {
        int n1=m-l+1,n2=r-m;
        int[] left=new int[n1];
        int[] right=new int[n2];
        for(int i=0;i<n1;i++)
            left[i]=n[l+i];
        for(int i=0;i<n2;i++)
           right[i]=n[m+1+i];
        int i=0,j=0,k=l;
        while(i<n1 && j<n2)
        {
           if(left[i]<right[j])
           {
               n[k++]=left[i++];
           }
            else
                n[k++]=right[j++];
        }
        if(i<n1)
        {
            while(i<n1)
            {
               n[k++]=left[i++];
            }
        }
        else
        {
            while(j<n2)
            {
                n[k++]=right[j++];
            }
        }
            
        
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n[]= new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++)
            n[i]=nums1[i];
        for(int i=nums1.length;i<nums1.length+nums2.length;i++)
            n[i]=nums2[i-nums1.length];
        //Arrays.sort(n);
        merge(0,nums1.length+nums2.length-1,n);
        double c=0.0;
        if((nums1.length+nums2.length)%2==0)
        {
            c=(n[(nums1.length+nums2.length)/2]+n[((nums1.length+nums2.length)/2)-1])/2.0;
                  return c;
        }
        else
            return (double)n[(nums1.length+nums2.length)/2];
    }
}