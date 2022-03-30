class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<String ,String> m=new HashMap<>();
        String ss[]=s.split(" ");
        if(pattern.length()!=ss.length)
            return false;
        for(int i=0;i<pattern.length();i++)
        {
            if(!m.containsKey(pattern.charAt(i)+""))
            {
                if(m.containsValue(ss[i]))
                    return false;
                m.put(pattern.charAt(i)+"",ss[i]);
            }
            else
            {
                if(!m.get(pattern.charAt(i)+"").equals(ss[i]))
                  return false;  
            }
        }
        return true;
    }
}