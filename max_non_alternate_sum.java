import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

   

    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    a[i]=s.nextInt();
    if(n==0)
    System.out.println("0");
    else if(n==1)
    {a[0]=Math.max(0,a[0]);
    System.out.println(a[0]);}
    else
    {a[0]=Math.max(0,a[0]);
    a[1]=Math.max(a[0],a[1]);
    for(int i=2;i<n;i++)
    a[i]=Math.max(a[i-1],a[i-2]+a[i]);
    System.out.println(a[n-1]);}}}