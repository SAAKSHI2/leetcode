/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int ans=0;
        Map<Integer,Integer> x=new HashMap<>();
         Map<Integer,List<Integer>> m=new HashMap<>();
        for(int i=0;i<employees.size();i++)
        {
            x.put(employees.get(i).id,employees.get(i).importance);
            m.put(employees.get(i).id,employees.get(i).subordinates);
        }
       Queue<Integer> q=new LinkedList<>();
        q.add(id);
        while(q.size()>0)
        {
            int p=q.poll();
            ans+=x.get(p);
            for(int i=0;i<m.get(p).size();i++)
            {
                q.add(m.get(p).get(i));
            }
        }
        return ans;
    }
}