class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int s=Integer.MAX_VALUE,c=0;
        for(int i=1;i<=6;i++)
        {
            c=0;
            int j=0;
            for(j=0;j<tops.length;j++)
            {
                if(tops[j]==i)
                  continue;
                else if(bottoms[j]==i)
                    c++;
                else
                    break;
            }
            if(c>0 && j==tops.length)
                s=Math.min(s,c);
            else if(c==0 && j==tops.length)
                return 0;
        }
      //  System.out.println(s);
        int sb=Integer.MAX_VALUE;
        for(int i=1;i<=6;i++)
        {
            c=0;
            int j=0;
            for(j=0;j<tops.length;j++)
            {
                if(bottoms[j]==i)
                  continue;
                else if(tops[j]==i)
                    c++;
                else
                    break;
            }
            if(c>0 && j==tops.length)
                sb=Math.min(sb,c);
            else if(c==0 && j==tops.length)
                return 0;
        }
        if(sb==s && sb==Integer.MAX_VALUE)
            return -1;
        return Math.min(sb,s);
        
    }
}