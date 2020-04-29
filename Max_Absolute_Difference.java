	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 int a[]=new int[n];
	 for(int i=0;i<n;i++)
	 {a[i]=s.nextInt();}
	 int mxl=0,mxr=0,mnl=0,mnr=0;
	 int ans=0;
	 for(int i=0;i<n-1;i++)
	 {int l=i;
	 int r=i+1;
	 int s1=0,s2=0;
	 mxl=mnl=a[l];
	 mxr=mnr=a[r];
	 while(l>=0)
	 {s1+=a[l];
	 mxl=Math.max(mxl,s1);
	 mnl=Math.min(mnl,s1);
	 l--;}
	 while(r<n)
	 {s2+=a[r];
	 mxr=Math.max(mxr,s2);
	 mnr=Math.min(mnr,s2);
	 r++;}
	     ans=Math.max(ans,Math.max(Math.abs(mxr-mnl),Math.abs(mnr-mxl)));
	 }
	 System.out.println(ans);
	 }
	 }