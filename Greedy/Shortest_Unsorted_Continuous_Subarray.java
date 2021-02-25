class Solution {
    public int findUnsortedSubarray(int[] a) {
        int n=a.length;
        int b[]=new int[n];
        for(int i=0;i<n;i++)
            b[i]=a[i];
        Arrays.sort(b);
        int ans=0;
        int i=0,j=n-1;
        while(i<=j && ((a[i]==b[i])||(a[j]==b[j])))
        {
            if(i==j)
                return 0;
            if(a[i]==b[i])
                i++;
            if(a[j]==b[j])
                j--;
        }
        return j-i+1;
    }
}