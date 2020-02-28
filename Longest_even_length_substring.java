public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {String c=s.next();
	 int max=0;
	 for(int i=0;i<c.length()-1;i++)
	 {int l=i,h=i+1,ls=0,rs=0;
	 while(l>=0 && h<c.length())
	 {ls+=c.charAt(l)-'0';
	  rs+=c.charAt(h)-'0';
	  if(ls==rs)
	  max=Math.max(max,h-l+1);
	  l--;h++;
	 }
	 }
	 System.out.println(max);
	 }}