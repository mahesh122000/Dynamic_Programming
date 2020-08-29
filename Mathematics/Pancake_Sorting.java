class Solution {
    public List<Integer> pancakeSort(int[] a) {
        int n=a.length;
        List<Integer>al=new ArrayList<>();
        int l=n-1,val=n;
        while(l>=0)
        {
            int ind=0;
            for(int i=0;i<=l;i++)
            {
                if(val==a[i])
                {
                    ind=i;
                    break;
                }
            }
            al.add(ind+1);
            flip(a,0,ind);
            al.add(l+1);
            flip(a,0,l);
            l--;
            val--;
        }
        return al;
    }
    void flip(int a[],int i,int j)
    {
        int p=i,q=j;
        while(p<q)
        {
            int t=a[p];
            a[p]=a[q];
            a[q]=t;
            p++;
            q--;
        }
    }
}