class Solution {
    public int titleToNumber(String columnTitle) {
        int x=0;
        for(int i=0;i<columnTitle.length();i++){
            x+=(Math.pow(26,i)*(columnTitle.charAt(columnTitle.length()-1-i)-'A'+1));
        }
        return x;
    }
}