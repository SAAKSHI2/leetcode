class Solution {
    public String reverseVowels(String s) {
        String v="aeiouAEIOU";
        char [] ch=s.toCharArray();
        int l=0,h=s.length()-1;
        while(l<h)
        {
            if(v.contains(ch[l]+"") && v.contains(ch[h]+""))
            {
                char c=ch[l];
                ch[l]=ch[h];
                ch[h]=c;
                l++;
                h--;
            }
            else if(v.contains(ch[l]+""))
                h--;
            else if(v.contains(ch[h]+""))
                l++;
            else
            {
                h--;
                l++;
            }      
        }
        return String.valueOf(ch);
    }
}