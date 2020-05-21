class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {
	     int n=s.nextInt();
	     int a[][]=new int[2][n];
	     for(int i=0;i<2;i++)
	     {for(int j=0;j<n;j++)
	     a[i][j]=s.nextInt();}
	     int b[]=new int[n];
	     if(n==1)
	     System.out.println(Math.max(a[0][0],a[1][0]));
	     else if(n==2)
	     System.out.println(Math.max(a[0][0],Math.max(a[1][0],Math.max(a[0][1],a[1][1]))));
	     else
	     {
	         b[0]=Math.max(a[0][0],a[1][0]);
	         b[1]=Math.max(a[0][0],Math.max(a[1][0],Math.max(a[0][1],a[1][1])));
	         for(int i=2;i<n;i++)
	         b[i]=Math.max(b[i-1],b[i-2]+Math.max(a[0][i],a[1][i]));
	         System.out.println(b[n-1]);
	     }
	 }
	 }
}