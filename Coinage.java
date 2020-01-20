import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            int a=s.nextInt(),b=s.nextInt();
            int c=s.nextInt(),d=s.nextInt();
            int ans=0;
            for(int i=0;i<=b && i*2<=n;i++)
            {for(int j=0;j<=c && j*5<=n;j++)
            {for(int k=0;k<=d && k*10<=n;k++)
            {int p=i*2+j*5+k*10;
            if(n-p<=a && n-p>=0)
            ans++;}}}
            System.out.println(ans);}
        
        }
    }

//coin exchange with limited coins