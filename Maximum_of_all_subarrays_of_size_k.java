class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 long a[]=new long[n];
	 int k=s.nextInt();
	 for(int i=0;i<n;i++)
	 a[i]=s.nextLong();
	 long l[]=new long[n];
	 long r[]=new long[n];
	 for(int i=0;i<n;i++)
	 {if(i%k==0)
	 l[i]=a[i];
	 else
	 {if(l[i-1]<a[i])
	 l[i]=a[i];
	 else
	 l[i]=l[i-1];}}
	 r[n-1]=a[n-1];
	 int j=n%k;
	 int ll=j;
	 for(int i=n-2;j>0;i--,j--)
	 r[i]=Math.max(a[i],r[i+1]);
	 int d=n-ll;
	 for(int i=d-1;i>=0;i--)
	 {if(i%k==k-1)
	 r[i]=a[i];
	 else
	 {if(r[i+1]<a[i])
	 r[i]=a[i];
	 else
	 r[i]=r[i+1];}}
	 for(int i=0;i<=n-k;i++)
	 System.out.print(Math.max(l[i+k-1],r[i])+" ");
	 System.out.println();
	/* for(int i=0;i<n;i++)
	 System.out.print(l[i]+" ");
	 System.out.println();
	 for(int i=0;i<n;i++)
	 System.out.print(r[i]+" ");  */
	     
	 }}}
	 