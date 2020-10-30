class Solution
{
    public long prime_Sum(int n)
    {
        long sum=0;
        HashSet<Integer>hs=new HashSet<>();
        for(int i=2;i*i<=n;i++)
        {
            if(!hs.contains(i))
            {
                for(int j=i*i;j<=n;j+=i)
                {
                    hs.add(j);
                }
            }
        }
        for(int i=2;i<=n;i++)
        {
            if(!hs.contains(i))
            sum+=i;
        }
        return sum;
    }
    
}