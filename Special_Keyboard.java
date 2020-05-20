class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {
	     int n=s.nextInt();
	     int a[]=new int[n+1];
	     for(int i=1;i<=n;i++)
	     {if(i<=6)
	     a[i]=i;
	     else
	     {a[i]=Math.max(a[i-3]*2,Math.max(a[i-4]*3,a[i-5]*4));}
	     }
	     if(n>75)
	     System.out.println("-1");
	     else
	     System.out.println(a[n]);
	 }
	 }
}