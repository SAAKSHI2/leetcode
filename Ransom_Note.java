class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<ransomNote.length();i++)
        {
            m.put(ransomNote.charAt(i),m.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for(int i=0;i<magazine.length();i++)
        {
            if(m.containsKey(magazine.charAt(i)))
            {
                m.put(magazine.charAt(i),m.get(magazine.charAt(i))-1);
            }
        }
        for( Map.Entry<Character,Integer> e:m.entrySet())
        {
            if(e.getValue()>0)
                return false;
        }
        return true;
    }
}