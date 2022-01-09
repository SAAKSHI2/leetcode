class Solution {
    public boolean isValid(String s) {
        while(true)
        {
            if(s.contains("()")||s.contains("{}")||s.contains("[]"))
            {
                  s=s.replace("()","");
                  s=s.replace("{}","");
                  s=s.replace("[]","");
            }
            else
                break;
        }
        if(s.length()!=0)
            return false;
        return true;
    }
}