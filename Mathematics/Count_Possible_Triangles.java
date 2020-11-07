class Solution
{
    static int findNumberOfTriangles(int a[], int n)
    {
        Arrays.sort(a);
        int count=0;
        for(int k=n-1;k>=2;k--)
        {
            int i=0,j=k-1;
            while(i<j)
            {
                if(a[i]+a[j]>a[k])
                {
                    count+=j-i;
                    j--;
                }
                else
                   i++;
            }
        }
        return count;
    }
}