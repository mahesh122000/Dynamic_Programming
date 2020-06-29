import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static int a[][][];
     static int noOfPossibleTrue(String s,int i,int j,int isTrue)
     {
         if(i>j)
         return 0;
         if(i==j)
         {
             if(isTrue==1)
             {
                 if('T'==s.charAt(i))
                 return 1;
                 else
                 return 0;
             }
             else
             {
                 if('F'==s.charAt(i))
                 return 1;
                 else
                 return 0;
             }
         }
         if(a[i][j][isTrue]!=-1)
         {
             return a[i][j][isTrue];
         }
         int ans=0;
         for(int k=i+1;k<j;k+=2)
         {
             int leftTrue=noOfPossibleTrue(s,i,k-1,1);
             int leftFalse=noOfPossibleTrue(s,i,k-1,0);
             int rightTrue=noOfPossibleTrue(s,k+1,j,1);
             int rightFalse=noOfPossibleTrue(s,k+1,j,0);
             char c=s.charAt(k);
             if(c=='^')
             {
                 if(isTrue==1)
                 {
                    ans+=leftTrue*rightFalse+leftFalse*rightTrue;
                 }
                 else
                 {
                    ans+=leftTrue*rightTrue+leftFalse*rightFalse;
                 }
             }
             if(c=='&')
             {
                 if(isTrue==1)
                 {
                    ans+=leftTrue*rightTrue;
                 }
                 else
                 {
                    ans+=leftFalse*rightFalse+leftFalse*rightTrue+leftTrue*rightFalse;
                 }
             }
             if(c=='|')
             {
                 if(isTrue==1)
                 {
                    ans+=leftTrue*rightTrue+leftFalse*rightTrue+leftTrue*rightFalse;
                 }
                 else
                 {
                    ans+=leftFalse*rightFalse; 
                 }
             }
         }
         ans=ans%1003;
         a[i][j][isTrue]=ans;
         return ans;
     }
	public static void main (String[] args)
	 {
	     Scanner s=new Scanner(System.in);
	     int t=s.nextInt();
	     while(t-->0)
	     {
	         int n=s.nextInt();
	         String c=s.next();
	         a=new int[201][201][2];
	         for(int i=0;i<=200;i++)
	         {
	             for(int j=0;j<=200;j++)
	             {
	                 for(int k=0;k<2;k++)
	                 {
	                     a[i][j][k]=-1;
	                 }
	             }
	         }
	         System.out.println(noOfPossibleTrue(c,0,n-1,1));
	     }
	 }
}