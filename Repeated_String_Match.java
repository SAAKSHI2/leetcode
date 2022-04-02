class Solution {
    public int repeatedStringMatch(String a, String b) {
      int min=1;
        String x=a;
      while(a.length()<b.length())
      {
          a=a+x;
          min++;
      }
        if(a.contains(b))
            return min;
        if((a+x).contains(b))
            return ++min;
        return -1;
    }
}