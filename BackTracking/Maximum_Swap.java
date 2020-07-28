 class Solution {
    static int ans;
    static ArrayList<Integer>al;
    public int maximumSwap(int num) {
        ans=num;
        al=new ArrayList<>();
        while(num>0)
        {
            al.add(0,num%10);
            num/=10;
        }
        for(int i=0;i<al.size();i++)
        {
            for(int j=i+1;j<al.size();j++)
            {
                swap(i,j);
                max();
                swap(i,j);
            }
        }
        return ans;
    }
    void swap(int i,int j)
    {
        int t=al.get(i);
        al.set(i,al.get(j));
        al.set(j,t);
    }
    void max()
    {
        int val=0;
        for(int i=0;i<al.size();i++)
        {
            val=val*10+al.get(i);
        }
        ans=Math.max(ans,val);
    }
}