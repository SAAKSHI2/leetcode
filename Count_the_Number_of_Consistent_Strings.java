class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0,j=0;
        for(int i=0;i<words.length;i++)
        {
            for(j=0;j<words[i].length();j++)
            {
                if(!allowed.contains(words[i].charAt(j)+""))
                  break;
            }
            if(j==words[i].length())
                c++;
        }
        return c;
    }
}