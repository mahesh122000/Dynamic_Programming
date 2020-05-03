public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {
	     int n=s.nextInt();
	     n+=2;
	     int a[]=new int[n+1];
	     a[0]=1;
	     a[1]=0;
	     if(n>=2)
	     a[2]=1;
	     for(int i=4;i<=n;i+=2)
	     {for(int j=2;j+2<=i;j+=2)
	     a[i]+=a[j]*a[i-j];}
	     System.out.println(a[n]);
	 }
	 }