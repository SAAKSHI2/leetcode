class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l=0,r=people.length-1;
        int c=0;
        while(l<=r)
        {
            if(people[l]+people[r]<=limit)
            {
                l++;
                r--;
                c++;
            }
            else if(people[r]<=limit)
            {
                r--;
                c++;
            }
             else if(people[l]<=limit)
            {
                l++;
                c++;
            }
            else if(people[l]+people[r]>limit)
            {
                r--;
            }
        
        }
        return c;
    }
}