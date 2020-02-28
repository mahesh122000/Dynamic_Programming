import java.io.*;
import java.math.*;
import java.util.*;



public class Solution {

   
    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    a[i]=s.nextInt();
    int curr=0;
    int nxt=0;
    int ans=0;
    int loc=0;
    boolean flag=false;
    while(curr<n)
    {ans++;
     nxt=curr+k-1;
        if(nxt>=n)
        nxt=n-1;
        while(loc<=nxt && nxt<n && a[nxt]==0)
        nxt--;
        if(nxt<loc)
        {flag=true;break;}
        loc=nxt+1;
        nxt+=k;
        curr=nxt;
    }
    if(flag)
    System.out.println("-1");
    else
    System.out.println(ans);}}