import java.io.*;
import java.util.*;

public class Solution {


    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        PriorityQueue<Integer[]>pq=new PriorityQueue<>((p,q)->(Integer)p[0]-(Integer)q[0]);
        for(int i=0;i<n;i++)
        {pq.add(new Integer[]{s.nextInt(),s.nextInt()});}
        long ans=0;
        long t=0;
        PriorityQueue<Integer[]>pq2=new PriorityQueue<>((p,q)->(Integer)p[1]-(Integer)q[1]);
        while(!pq.isEmpty() && pq.peek()[0]<=t)
        pq2.add(pq.poll());
        while(!pq.isEmpty() || !pq2.isEmpty())
        {   boolean flag=false;
            if(!pq2.isEmpty())
            {Integer x[]=pq2.poll();
            t=t+x[1];
            flag=true;
            ans+=t-x[0];}
            if(flag==false)
            t++;
            while(!pq.isEmpty() && pq.peek()[0]<=t)
            pq2.add(pq.poll());
        }
        System.out.println(ans/n);
    }
}