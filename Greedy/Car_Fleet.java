class Solution {
    public int carFleet(int t, int[] a, int[] b) {
        int n=a.length;
        if(n==0)
            return 0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++)
            hm.put(a[i],b[i]);
        float c[]=new float[n];
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            c[i]=(float)(t-a[i])/hm.get(a[i]);
        }
        float max=c[n-1];
        int count=1;
        for(int i=n-2;i>=0;i--)
        {
            if(c[i]>max)
            {
                count++;
                max=c[i];
            }
        }
        return count;
    }
}