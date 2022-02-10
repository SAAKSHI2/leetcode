class Solution {
    public void func(int ind,List<List<String>> a,List<String> z,String s)
    {
        if(ind==s.length())
        {
           a.add(new ArrayList<String>(z));
            return;
        }
        for(int i=ind;i<s.length();i++)
        {
            if(check(s.substring(ind,i+1)))
            {
              z.add(s.substring(ind,i+1));
              func(i+1,a,z,s);  
              z.remove(z.size()-1);
            }
        }  
    }
    public boolean check(String x)
    {
        for(int i=0;i<=x.length()/2;i++)
        {
            if(x.charAt(i)!=x.charAt(x.length()-1-i))
                return false;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> a=new ArrayList<>();
       func(0,a,new ArrayList<String>(),s);
       
        return a;
    }
}