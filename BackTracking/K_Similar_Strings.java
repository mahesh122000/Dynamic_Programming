class Solution {
    public int kSimilarity(String A, String B) {
        return find(A.toCharArray(),B.toCharArray(),0,0);
    }
    int find(char a[],char b[],int i,int count)
    {
        int val=Integer.MAX_VALUE;
        if(i==a.length-1)
        {
            if(Arrays.equals(a,b))
                return count;
            return val;
        }
        if(i>=a.length)
            return val;
        if(a[i]==b[i])
            return find(a,b,i+1,count);
        for(int j=i+1;j<a.length;j++)
        {
            if(a[i]==b[j] && a[j]!=b[j])
            {
                swap(b,i,j);
                val=Math.min(val,find(a,b,i+1,count+1));
                swap(b,i,j);
            }
        }
        return val;
    }
    void swap(char a[],int i,int j)
    {
        char c=a[i];
        a[i]=a[j];
        a[j]=c;
    }
}