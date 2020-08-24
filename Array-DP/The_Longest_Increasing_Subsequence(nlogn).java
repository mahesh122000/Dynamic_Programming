import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {a[i]=s.nextInt();}
    ArrayList<Integer>al=new ArrayList<>();
    al.add(a[0]);
    for(int i=1;i<n;i++)
    {
        if(al.get(al.size()-1)<a[i])
        al.add(a[i]);
        else
        {
            int k=Collections.binarySearch(al,a[i]);
            if(k<0)
            k=-k-1;
            //System.out.println(k);
            al.set(k,a[i]);
        }
    }
    System.out.println(al.size());
    }
}
