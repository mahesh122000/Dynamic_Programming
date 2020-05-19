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
	     int a[]=new int[n];
	     int l=0,h=0;
	     int ans=0;
	     for(int i=0;i<n;i++)
	     {a[i]=s.nextInt();
	     h+=a[i];
	     l=Math.max(l,a[i]);}
	     while(l<=h)
	     {
	         int m=(l+h)>>1;
	         int count=1;
	         int v=0;
	         for(int i=0;i<n;i++)
	         {if(v+a[i]<=m)
	         v+=a[i];
	         else
	         {v=a[i];
	         count++;}}
	         if(count>k)
	         l=m+1;
	         else
	         {ans=m;
	         h=m-1;}
	     }
	     System.out.println(ans);
	 }
	 }
}


