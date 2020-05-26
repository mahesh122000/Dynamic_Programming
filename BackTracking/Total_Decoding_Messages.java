class GFG
 {
     static int ans;
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {
	     int n=s.nextInt();
	     String c=s.next();
	     ans=0;
	     for(int i=1;i<=n;i++)
	     {if(poss(c.substring(0,i)))
	     {find(c,i,n);}}
	     System.out.println(ans);
	 }
	 }
	 static boolean poss(String s)
	 {
	     int n=s.length();
	     if(n>=3|s.charAt(0)=='0')
	     return false;
	     int v=Integer.parseInt(s);
	     if(v>=27)
	     return false;
	     return true;
	 }
	 static void find(String c,int i,int n)
	 {
	     if(i==n)
	     {ans++;
	     return;}
	     for(int j=i+1;j<=n;j++)
	     {if(poss(c.substring(i,j)))
	     {find(c,j,n);}}
	 }
}