class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        List<Integer> x=new ArrayList<>();
         for(int i=0;i<stones.length;i++)
        {
         x.add(stones[i]);   
        }
        while(x.size()>1)
        {
            int y=Math.abs(x.get(x.size()-1)-x.get(x.size()-2));
            x.remove(x.size()-1);
            x.remove(x.size()-1);
            x.add(y);
            Collections.sort(x);
           // System.out.println(x);
            
        }
        return x.get(0);
    }
}