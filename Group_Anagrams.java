class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> a=new ArrayList<>();
        int k=-1;
        Map<String,List<String>> m=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {           
            char ch[]=strs[i].toCharArray();
            Arrays.sort(ch);
            String x=String.valueOf(ch);
            if(m.containsKey(x))
            {
                m.get(x).add(strs[i]);
            }
            else
            {
                m.put(x,new ArrayList<String>());
                m.get(x).add(strs[i]);
            }
        }
        
        for(List<String> s:m.values())
        {
            a.add(s);
        }     
      return a;
    }
}