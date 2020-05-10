class Geeks 
{
    public static int maxHeight(int h[], int w[], int l[], int n)
   {
       int a[][]=new int[3*n][4];
       int j=0;
       for(int i=0;i<n;i++)
       {a[j][0]=h[i];
       a[j][1]=Math.max(w[i],l[i]);
       a[j][2]=Math.min(w[i],l[i]);
       a[j][3]=a[j][1]*a[j][2];
       j++;
       a[j][0]=w[i];
       a[j][1]=Math.max(h[i],l[i]);
       a[j][2]=Math.min(h[i],l[i]);
       a[j][3]=a[j][1]*a[j][2];
       j++;
       a[j][0]=l[i];
       a[j][1]=Math.max(w[i],h[i]);
       a[j][2]=Math.min(w[i],h[i]);
       a[j][3]=a[j][1]*a[j][2];
       j++;
   }
   Arrays.sort(a,(p,q)->q[3]-p[3]);
   int b[]=new int[3*n];
   for(int i=0;i<a.length;i++)
   b[i]=a[i][0];
   int max=0;
   for(int i=1;i<b.length;i++)
   {for(j=0;j<i;j++)
   {if(a[j][1]>a[i][1] && a[j][2]>a[i][2] && b[i]<b[j]+a[i][0])
   b[i]=b[j]+a[i][0];}
   }
   for(int i=0;i<b.length;i++)
    max=Math.max(max,b[i]);
    return max;
}
}