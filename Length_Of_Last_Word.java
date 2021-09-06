class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String s1[]=s.split(" ");
        int x = s1[s1.length-1].length();
        return x;
    }
}