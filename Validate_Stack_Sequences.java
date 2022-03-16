class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i=0,j=0;
        Stack<Integer> s=new Stack<>();
        while(i<pushed.length && j<popped.length)
        {
                if(s.size()>0 && s.peek()==popped[j])
                {
                    s.pop();
                    j++;
                }
                else
                {
                    s.push(pushed[i++]);
                }
        }
        while(j<popped.length)
        {
            if(s.peek()==popped[j])
            {
                s.pop();
                j++;
            }
            else
                break;
            
        }
        if(s.size()==0)
            return true;
        return false;
        
    }
}