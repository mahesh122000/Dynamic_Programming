class Solution {
    public int concatenatedBinary(int n) {
        int m=1000000007;
        StringBuilder sb=new StringBuilder();
        int i=1;
        while(i<=n)
        {
            sb.append((Integer.toBinaryString(i)));
            i++;
        }
        String s=sb.toString();
        int c=0;
        for(int j=0;j<s.length();j++)
        {
            if(s.charAt(j)=='1')
                c++;
            if(j!=s.length()-1)
            {
                c=(((c%m)*2)%m);
            }
        }
        return c;
    }
}


