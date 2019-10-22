import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner s=new Scanner(System.in);
	 int t=s.nextInt();
	 while(t-->0)
	 {int n=s.nextInt();
	 int sum=0;
	 for(int i=0;i<n;i++)
	 sum+=s.nextInt();
	 double ans=(sum*(Math.pow(2,n)-1))/n;
	 System.out.format("%.6f",ans);
	 System.out.println();
	 }}
}