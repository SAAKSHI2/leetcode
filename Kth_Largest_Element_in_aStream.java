class KthLargest {
  int k=0;
    List<Integer> l=new ArrayList<>();
    public KthLargest(int k, int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            l.add(nums[i]);
        }
        this.k=k;
         Collections.sort(l);
    }
    
    public int add(int val) {
        //l.add(val);
        if(l.size()>0 && l.get(0)>=val)
            l.add(0,val);
        else{
       int ll=0,r=l.size()-1;
        int flag=0;
        while(ll<=r)
        {
            int mid=(ll+r)/2;
            if(mid+1<l.size() && (l.get(mid)<=val && l.get(mid+1)>=val))
            {
                l.add(mid+1,val);
                flag=1;
                break;
            }
            else if(l.get(mid)<val)
                ll++;
            else
                r--;
        }
        if(flag==0)
            l.add(val);
        }
        return l.get(l.size()-k);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */