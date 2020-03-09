import java.io.*;
import java.util.*;

public class Solution {
    public static long compute(ArrayList<Long>al,ArrayList<Long>bl)
    {int n=al.size();
    int m=bl.size();
    long ans=0;
    for(int i=0;i<n;i++)
    {for(int j=0;j<m;j++)
    ans+=Math.abs(al.get(i)-bl.get(j));}
    return ans;}

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        if(2*k>n)
        k=n-k;
        long a[]=new long[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextLong();
        ArrayList<Long>al=new ArrayList<>();
        ArrayList<Long>bl=new ArrayList<>();
        HashSet<Integer>hs=new HashSet<>();
        Arrays.sort(a);
        int start=(n-2*k)/2;
        int stop=start+2*k;
        for(int i=start+1;i<=stop;i+=2)
        {bl.add(a[i]);hs.add(i);}
        for(int i=0;i<n;i++)
        {if(hs.contains(i))
        {}
        else
        {al.add(a[i]);}}
        System.out.println(compute(al,bl));
    }
}
