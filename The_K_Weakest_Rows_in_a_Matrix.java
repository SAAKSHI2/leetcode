class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int a[]=new int[k];
        ArrayList<ArrayList<Integer>> ar=new ArrayList<>();
        int c=0;
        for(int i=0;i<mat.length;i++)
        {
            int o=0;
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==1)
                    o++;
                else
                    break;
            }
            ar.add(new ArrayList<Integer>());
            ar.get(c).add(i);
            ar.get(c).add(o);
            c++;
        }
        Collections.sort(ar,new Comparator<ArrayList<Integer>>(){
            public int compare(ArrayList<Integer> ab,ArrayList<Integer> bc)
            {
                if(ab.get(1)==bc.get(1))
                {
                    return ab.get(0)-bc.get(0);
                }
                return ab.get(1)-bc.get(1);
            }
        });
      //  System.out.println(ar);
        for(int i=0;i<k;i++)
        {
            a[i]=ar.get(i).get(0);
        }
        return a;
    }
}