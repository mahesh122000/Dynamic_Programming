import java.io.*;
import java.math.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    while(t-->0)
    {int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    a[i]=s.nextInt();
    long sum=0;
    int k=a[n-1];
    for(int i=n-2;i>=0;i--)
    {if(k>a[i])
    {sum+=k;
    sum-=a[i];}
    else if(k<=a[i])
    {k=a[i];}}
    System.out.println(sum);}
    }
    }