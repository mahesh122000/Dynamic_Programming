import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        String c=s.next();
        int k=s.nextInt();
        int count=0;
        int idx=-1;
        int start=0;
        int n=c.length();
        int end=start+k;
        while(end<=n)
        {
            boolean flag=false;
            int inidx=-1;
            for(int i=start;i<end;i++)
            {if(c.charAt(i)=='1')
            {flag=true;
             inidx=i;
            }}
            if(flag==true)
            {start=inidx+1;
            end=start+k;}
            else
            {count++;
            start=end;
            end=start+k;}
        }
        System.out.println(count);
    }
}