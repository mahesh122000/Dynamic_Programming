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
	 {long n=s.nextLong();
	 String ans="";
	  while(n>0)
	  {n--;
	  ans=(char)(n%26+(int)('A'))+ans;
	  n=n/26;
	  }
	  System.out.println(ans);}
	 }
}