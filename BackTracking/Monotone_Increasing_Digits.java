class Solution {
    public int monotoneIncreasingDigits(int n) {
        ArrayList<Integer>al=new ArrayList<>();
        int m=n;
        while(n>0)
        {
            al.add(0,n%10);
            n=n/10;
        }
        int l=al.size();
        boolean flag=true;
        one:for(int i=0;i<l-1;i++)
        {
            if(al.get(i)>al.get(i+1))
            {
                al.set(i,al.get(i)-1);
                for(int j=i+1;j<l;j++)
                    al.set(j,9);
                flag=false;
                break one;
            }
        }
        if(flag)
            return m;
        int ans=0;
        for(int i=0;i<l;i++)
            ans=ans*10+al.get(i);
        return monotoneIncreasingDigits(ans);
    }
}