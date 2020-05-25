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
	     int max=0;
	     for(int i=0;i<m;i++)
	     {int b[]=new int[n];
	     for(int j=i;j<m;j++)
	     {for(int k=0;k<n;k++)
	     b[k]+=a[k][j];
	     max=Math.max(max,find(b));
	     }}
	     System.out.println(max);
	 }
	 }
	 public static int find(int a[])
	 {
	     int max=a[0];
	     int sum=a[0];
	     for(int i=1;i<a.length;i++)
	     {sum=Math.max(a[i]+sum,a[i]);
	     max=Math.max(max,sum);
	     }
	     return max;
	 }
}