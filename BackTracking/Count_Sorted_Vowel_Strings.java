class Solution {
    static int count;
    static char a[]={'a','e','i','o','u'};
    public int countVowelStrings(int n) {
        count=0;
        String s="";
        for(int i=0;i<5;i++)
        {
            s+=a[i];
            find(s,1,n);
            s=s.substring(0,s.length()-1);
        }
        return count;
    }
    void find(String s,int i,int n)
    {
        if(i==n)
        {
            count++;
            return;
        }
        int l=s.length();
        char c=s.charAt(l-1);
        for(int j=0;j<5;j++)
        {
            if(c>=a[j])
            {
                s+=a[j];
                find(s,i+1,n);
                s=s.substring(0,l-1);
            }
        }
    }
}