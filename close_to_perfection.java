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
	 int b[]=new int[n];
	 for(int i=0;i<n;i++)
	 b[i]=s.nextInt();
	 int max=0;
	 for(int i=0;i<n;i++)
	 {int a=b[i];
	 int count1=1;
	 int count2=1;
	 for(int j=i+1;j<n;j++)
	 {if(b[j]-a==1 || b[j]-a==0)
	 count1++;
	 else
	 break;}
	 for(int j=i+1;j<n;j++)
	 {if(b[j]-a==-1 || b[j]-a==0)
	 count2++;
	 else
	 break;}
	 max=Math.max(max,Math.max(count1,count2));
	 }
	 System.out.println(max);}
}}