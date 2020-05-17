class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {
	     String c=s.next();
	     int n=c.length();
	     HashSet<String>hs=new HashSet<>();
	     int l=0,h=0;
	     for(int i=0;i<n;i++)
	     hs.add(c.substring(i,i+1));
	     for(int i=0;i<n-1;i++)
	     {l=i;h=i+1;
	     while(l>=0 && h<n && c.charAt(l)==c.charAt(h))
	     {hs.add(c.substring(l,h+1));
	     l--;
	     h++;
	     }
	     l=i-1;h=i+1;
	     while(l>=0 && h<n && c.charAt(l)==c.charAt(h))
	     {hs.add(c.substring(l,h+1));
	     l--;
	     h++;
	     }
	     }
	     System.out.println(hs.size());
	 }
	 }
}