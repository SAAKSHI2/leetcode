class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> x=new ArrayList<>();
    //     char ch[]=p.toCharArray();
    //     Arrays.sort(ch);
    //     p=String.valueOf(ch);
    //     for(int i=0;i<=s.length()-p.length();i++)
    //     {
    //         String sub=s.substring(i,i+p.length());
    //          char ch2[]=sub.toCharArray();
    //       Arrays.sort(ch2);
    //     sub=String.valueOf(ch2);
    //         if(p.equals(sub))
    //         {
    //             x.add(i);
    //         }
    //     }
    //     return x;
        Map<Character,Integer> m=new HashMap<>();
         Map<Character,Integer> m2=new HashMap<>();
        for(int i=0;i<p.length();i++)
        {
            m.put(p.charAt(i),m.getOrDefault(p.charAt(i),0)+1);
        }
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(m2.equals(m))
                x.add(i-p.length());
             m2.put(s.charAt(i),m2.getOrDefault(s.charAt(i),0)+1);
            c++;
            if(c>p.length())
            {
                m2.put(s.charAt(i-p.length()),m2.get(s.charAt(i-p.length()))-1);
                if(m2.get(s.charAt(i-p.length()))==0)
                {
                    m2.remove(s.charAt(i-p.length()));
                }
                c--;
            }
        }
         if(m2.equals(m))
                x.add(s.length()-p.length());
        return x;
        
     }
}