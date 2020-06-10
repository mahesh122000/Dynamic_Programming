import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static HashMap<Character,Integer>hm;
	public static void main (String[] args)
	 {
	  hm=new HashMap<>();
	  hm.put('I',1);
	  hm.put('V',5);
	  hm.put('X',10);
	  hm.put('L',50);
	  hm.put('C',100);
	  hm.put('D',500);
	  hm.put('M',1000);
	  Scanner s=new Scanner(System.in);
	  int t=s.nextInt();
	  while(t-->0)
	  {
	      String c=s.next();
	      int n=c.length();
	      int ans=0;
	      int i=0;
	      while(i<n)
	      {
	          if(i<n-1 && hm.get(c.charAt(i))<hm.get(c.charAt(i+1)))
	          {ans+=hm.get(c.charAt(i+1))-hm.get(c.charAt(i));
	          i+=2;}
	          else
	          {ans+=hm.get(c.charAt(i));
	          i++;}
	      }
	      System.out.println(ans);
	  }
	 }
}

