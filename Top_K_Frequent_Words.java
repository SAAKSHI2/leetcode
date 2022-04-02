class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> m=new HashMap<>();
        for(int i=0;i<words.length;i++)
        {
            m.put(words[i],m.getOrDefault(words[i],0)+1);
        }
        List<Map.Entry<String,Integer>> l=new ArrayList<>(m.entrySet());
        Collections.sort(l,new Comparator<Map.Entry<String,Integer>>(){
            public int compare(Map.Entry<String,Integer> a,Map.Entry<String,Integer> b)
            {
                if(a.getValue()==b.getValue())
                {
                    return (a.getKey()).compareTo(b.getKey());
                }
                return b.getValue()-(a.getValue());
            }
        });
        List<String> s=new ArrayList<>();
        for(Map.Entry<String,Integer> x : l)
        {
            if(k==0)
                return s;
            s.add(x.getKey());
            k--;
        }
        return s; 
        
    }
}