class Solution {
    ArrayList<Integer>al;
    HashSet<Integer>hs;
    public int[] numsSameConsecDiff(int n, int k) {
        int num=0;
        al=new ArrayList<>();
        hs=new HashSet<>();
        if(n==1)
            al.add(0);
        for(int i=1;i<=9;i++)
        {
            num=i;
            find(num,1,k,n);
        }
        int l=al.size();
        int a[]=new int[l];
        for(int i=0;i<l;i++)
            a[i]=al.get(i);
        return a;
    }
    void find(int val,int i,int k,int n)
    {
        if(i==n)
        {
            if(!hs.contains(val))
            {al.add(val);
            hs.add(val);}
            return ;
        }
        int p=val%10;
        if(p+k<10)
        {
            int num=val*10+p+k;
            find(num,i+1,k,n);
        }
        if(p-k>=0)
        {
            int num=val*10+p-k;
            find(num,i+1,k,n);
        }
    }
}