import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    public static long find(long n,HashMap<Long,Long>hm)
    {if(hm.containsKey(n))
    return hm.get(n);
    else 
    {hm.put(n,1+2*find(n/2,hm));
    return hm.get(n);}
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
	    long h=s.nextLong();
	    HashMap<Long,Long>hm=new HashMap<>();
	    Long p=new Long(1);
	    Long q=new Long(1);
	    hm.put(p,q);
	    long ans=find(h,hm);
	    System.out.println(ans);}}



//