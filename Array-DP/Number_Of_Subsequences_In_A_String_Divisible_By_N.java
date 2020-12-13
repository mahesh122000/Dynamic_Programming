class Solution{

	public int countDivisibleSubseq(String s,int n) 
	{ 
	    int l=s.length();
	    int a[][]=new int[l][n];
	    a[0][(int)(s.charAt(0)-'0')%n]++;
	    for(int i=1;i<l;i++)
	    {
	        a[i][(int)(s.charAt(i)-'0')%n]++;
	        for(int j=0;j<n;j++)
	        {
	            a[i][j]+=a[i-1][j];
	            a[i][j]%=1000000007;
	            a[i][(j*10+(int)(s.charAt(i)-'0'))%n]+=a[i-1][j];
	            a[i][(j*10+(int)(s.charAt(i)-'0'))%n]%=1000000007;
	        }
	    }
	    return a[l-1][0]%1000000007;
	} 
}