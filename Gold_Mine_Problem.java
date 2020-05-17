class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {
	     int n=s.nextInt();
	     int m=s.nextInt();
	     int a[][]=new int[n][m];
	     for(int i=0;i<n;i++)
	     {for(int j=0;j<m;j++)
	     a[i][j]=s.nextInt();
	     }
	     int ans=0;
	     for(int i=m-2;i>=0;i--)
	     {for(int j=0;j<n;j++)
	     {int max=0;
	     if(i+1<m)
	     max=Math.max(max,a[j][i+1]);
	     if(i+1<m && j-1>=0)
	     max=Math.max(max,a[j-1][i+1]);
	     if(i+1<m && j+1<n)
	     max=Math.max(max,a[j+1][i+1]);
	     a[j][i]+=max;
	     }}
	     for(int i=0;i<n;i++)
	     ans=Math.max(ans,a[i][0]);
	     System.out.println(ans);
	 }
	 }
}