class Solution {
    // void func(char[] s,List<String> a,int ind)
    // {
    //     if(ind==s.length)
    //     {
    //         String x=String.valueOf(s);
    //         a.add(x);
    //         return;
    //     }
    //     for(int i=ind;i<s.length;i++)
    //     {
    //         char t=s[i];
    //         s[i]=s[ind];
    //         s[ind]=t;
    //         func(s,a,ind+1);
    //          t=s[i];
    //         s[i]=s[ind];
    //         s[ind]=t;
    //     }
    // }
    public boolean checkInclusion(String s1, String s2) {
        // List<String> a=new ArrayList<>();
        // char s[]=s1.toCharArray();
        // func(s,a,0);
        // for(int i=0;i<a.size();i++)
        // {
        //     if(s2.contains(a.get(i)))
        //         return true;
        // }
        // return false;
        
        // Map<Character,Integer> m= new HashMap<>();
        // Map<Character,Integer> m2= new HashMap<>();
        // for(int i=0;i<s1.length();i++)
        // {
        //     m.put(s1.charAt(i),m.getOrDefault(s1.charAt(i),0)+1);
        // }
        // int c=0;
        // for(int i=0;i<s2.length();i++)
        // {
        //     if(m.equals(m2))
        //         return true;
        //      m2.put(s2.charAt(i),m2.getOrDefault(s2.charAt(i),0)+1);
        //     c++;
        //     if(c>s1.length())
        //     {
        //         c--;
        //         m2.put(s2.charAt(i-s1.length()),m2.get(s2.charAt(i-s1.length()))-1);
        //         if(m2.get(s2.charAt(i-s1.length()))==0)
        //             m2.remove(s2.charAt(i-s1.length()));
        //     }
        // }
        // System.out.println(m+" "+m2);
        //  if(m.equals(m2))
        //         return true;
        
        
        int a[]=new int[26];
        int b[]=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            a[s1.charAt(i)-'a']++;
        }
        int c=0;
        for(int i=0;i<s2.length();i++)
        {
            b[s2.charAt(i)-'a']++;
            c++;
            if(c>=s1.length())
            {
                int j=0;
                for(j=0;j<26;j++)
                {
                    if(a[j]!=b[j])
                      break;
                }
                if(j==26)
                    return true;
                b[s2.charAt(i-s1.length()+1)-'a']--;
            }
            
        }
        return false;
    }
}