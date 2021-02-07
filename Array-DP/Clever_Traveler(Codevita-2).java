

import java.util.*;
import java.io.*;

class Main {

    public static void main(String arg[]) {
        Scanner s=new Scanner(System.in);
        int a[]=new int[5];
        int b[]=new int[5];
        for(int i=0;i<5;i++)
        {
            a[i]=s.nextInt();
            b[i]=Integer.MAX_VALUE;
        }
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<5;j++)
            {
                b[j]=Math.min(b[j],s.nextInt());
            }
        }
        int d=s.nextInt();
        int c[]=new int[d];
        for(int i=0;i<d;i++)
        c[i]=s.nextInt();
        int p=c[d-1];
        int q=b[4];
        int ans=p*b[0];
        int e[]=new int[p+q-1];
        e[c[0]-1]=0;
        for(int i=c[0];i<p+q-1;i++)
        e[i]=Integer.MAX_VALUE;
        for(int i=0,jj=0;jj<d;jj++)
        {
            i=c[jj];
            if(jj>0 && c[jj-1]+1!=c[jj])
            i=c[jj-1]+1;
            for(int j=0;j<5;j++)
            {
                int k=c[jj]+a[j];
                for(int g=c[jj];g<k && g<=p;g++)
                {
                    e[g]=Math.min(e[g],e[i-1]+b[j]);
                    //System.out.print(g+": "+e[g]+", ");
                }
            //    System.out.println();
            }
        }
    //    for(int i=c[0];i<=p;i++)
    //    System.out.print(e[i]+" ");
    //    System.out.println();
        System.out.println(e[p]);
    }
}
  
/*
You are given the data of travel schedule of a traveler and prices of travel passes provided by N different companies. There is no restriction on the number of times one can buy the passes. However the objective is to buy optimal number such that the traveling cost is minimized. You can buy passes from different companies for different days.

The passes can be single day or multi-day pass. In case of multi-day pass the pass is valid for those many travels on consecutive days only. For e.g. a 10-day pass can be used to travel 10 times from Day 1 to Day 10. The pass expires at the end of 10th day. Hence it can not be used for any further travel. Similarly a N day pass expires at the end of Nth day from the day of issue.

For better understanding refer to Examples section.
*/
  