class Solution {
    public int maximumSwap(int num) {
        int a[]=new int[Integer.toString(num).length()];
        int x=num;
        for(int i=0;i<a.length;i++)
        {
            a[a.length-i-1]=num%10;
            num=num/10;
        }
        
        int i=0,j=0;
        while(i<a.length-1)
        {
           j=i+1;
            int flag=1;
            while(a[i]>=a[j])
            {
                j++;
                if(j==a.length)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            {
                int y=j,m=a[j];
                while(y<a.length)
                {
                   if(a[y]>=m)
                   {
                       j=y;
                       m=a[j];
                   }
                    y++;
                }
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
                int ans=0;
                for(int k=0;k<a.length;k++)
                {
                    ans=ans*10+a[k];
                }
                return ans;
            }
            i++;
        }
        return x;
    }
}