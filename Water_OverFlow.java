class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {
	     int k=s.nextInt();
	     int n=s.nextInt();
	     int m=s.nextInt();
	     double a[][]=new double[n+1][n+1];
	     for(int i=1;i<=n;i++)
	     {for(int j=1;j<=m;j++)
	     {if(i==1)
	     a[i][j]=k;
	     else
	     {if(j==1)
	     a[i][j]=(a[i-1][j]<=1)?0:(a[i-1][j]-1)/2.0;
	     else if(j==i)
	     a[i][j]=(a[i-1][j-1]<=1)?0:(a[i-1][j-1]-1)/2.0;
	     else
	     {a[i][j]=(a[i-1][j-1]<=1)?0:(a[i-1][j-1]-1)/2.0;
	     a[i][j]+=(a[i-1][j]<=1)?0:(a[i-1][j]-1)/2.0;
	     }}
	     }}
	     if(a[n][m]>=1)
	     System.out.print("1.000000");
	     else
	     System.out.format("%.6f",a[n][m]);
	     System.out.println();
	 }
	 }
}