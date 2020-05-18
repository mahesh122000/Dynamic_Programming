class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 int a[][]=new int[n][n];
	 for(int i=0;i<n;i++)
	 {for(int j=0;j<n;j++)
	 a[i][j]=s.nextInt();
	 }
	 int max=0;
	 for(int i=1;i<n;i++)
	 {int m1=0,m2=0;
	 int p1=0,p2=0;
	 for(int j=0;j<n;j++)
	 {
	 if(m1<a[i-1][j])
	 {m2=m1;
	 p2=p1;
	 m1=a[i-1][j];
	 p1=j;
	 }
	 else if(m2<a[i-1][j])
	 {m2=a[i-1][j];
	 p2=j;
	 }}
	 for(int j=0;j<n;j++)
	 {if(j==p1)
	 a[i][j]+=m2;
	 else
	 a[i][j]+=m1;}}
	 for(int i=0;i<n;i++)
	 max=Math.max(max,a[n-1][i]);
	 System.out.println(max);
	 }
	 }
}