class GfG{
	public boolean isInterLeave(String a,String b,String c)
	{
            return find(a,b,c,0,0,0);
	}
	public boolean find(String a,String b,String c,int i,int j,int k)
	{
	    boolean ans=false;
	    int n=a.length();
	    int m=b.length();
	    int r=c.length();
	    if(i==n)
	    return check(b,c,j,k);
	    if(j==m)
	    return check(a,c,i,k);
	    if(k==r)
	    return false;
	    if(a.charAt(i)==c.charAt(k))
	    ans|=find(a,b,c,i+1,j,k+1);
	    if(b.charAt(j)==c.charAt(k))
	    ans|=find(a,b,c,i,j+1,k+1);
	    return ans;
	}
	public boolean check(String a,String b,int i,int j)
	{
	    int n=a.length();
	    int m=b.length();
	    if(n-i>m-j)
	    return false;
	    for(int k=i,p=0;k<n;k++,p++)
	    {if(a.charAt(k)!=b.charAt(j+p))
	    return false;
	    }
	    return true;
	}
}