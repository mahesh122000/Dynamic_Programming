public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {
	     int n=s.nextInt();
	     int a[]=new int[n];
	     int sum=0;
	     for(int i=0;i<n;i++)
	     {a[i]=s.nextInt();
	     sum+=a[i];}
	     int k=sum/2;
	     boolean b[][]=new boolean[n+1][k+1];
	     for(int i=0;i<=n;i++)
	     b[i][0]=true;
	     for(int i=1;i<=n;i++)
	     {for(int j=1;j<=k;j++)
	     {if(a[i-1]<=j)
	     {b[i][j]=b[i-1][j]||b[i-1][j-a[i-1]];}
	     else
	     b[i][j]=b[i-1][j];
	     }}
	     int m=0;
	     for(int i=k;i>=0;i--)
	     {if(b[n][i])
	     {m=i;
	     break;}}
	     System.out.println(sum-2*m);
	 }
	 }