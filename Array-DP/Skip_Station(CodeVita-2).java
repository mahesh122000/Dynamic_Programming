
import java.util.*;
import java.io.*;

class Main {
    
    static long find(int n)
    {
        if(n==0)
        return 1;
        if(n==1)
        return 2;
        if(n==2)
        return 4;
        long a[]=new long[n+1];
        a[0]=1;
        a[1]=2;
        a[2]=4;
        for(int i=3;i<=n;i++)
        {
            a[i]+=a[i-1]+a[i-2]+a[i-3];
        }
        return a[n];
    }
    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0)
        {
            int n=s.nextInt();
            System.out.println(find(n));
        }
        
    }
}
  

/*
Codu wants to travel from City A to City B. There are N stations between A and B. There are 3 kinds of trains that run from every station.

Train 1- Stops at every station

Train 2- Stops at every alternate station

Train 3- Stops at every third station

Codu can use any combination of the trains to reach from City A to City B. However, he cannot travel in the reverse direction during the course of his travel. He is allowed to change as many trains as needed to reach the destination.

You need to find how many ways Codu can reach City B from City A.
*/