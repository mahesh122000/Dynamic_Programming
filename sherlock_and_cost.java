import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {

    
    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    while(t-->0)
    {int n=s.nextInt();
    int b[]=new int[n];
    for(int i=0;i<n;i++)
    b[i]=s.nextInt();
    int low = 0;
    int high = 0;
    int max = 0;
    for (int i=1; i<b.length; i++) {
        int prev_low = low;
        int prev_high = high;
        low = Math.max(prev_low, high+Math.abs(b[i-1]-1));
        high = Math.max(prev_high+Math.abs(b[i]-b[i-1]), prev_low+Math.abs(b[i]-1));
        max = Math.max(low, high);
    }
    System.out.println(max);}}}
