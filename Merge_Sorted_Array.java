class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // for(int i=0;i<n;i++)
        // {
        //     nums1[i+m]=nums2[i];
        // }
        // Arrays.sort(nums1);
        int a[]=new int[nums1.length];
        int i=0,j=0,k=0;
        while(i<m&&j<n)
        {
            if(nums1[i]<nums2[j])
            {
                a[k++]=nums1[i++];
            }
            else
                a[k++]=nums2[j++];
        }
        if(i<m)
        {
            while(i<m)
                a[k++]=nums1[i++];
        }
        else if(j<n)
        {
            while(j<n)
                a[k++]=nums2[j++];
        }
        for(i=0;i<nums1.length;i++)
            nums1[i]=a[i];
        
    }
}