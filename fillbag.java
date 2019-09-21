import java.util.*;
import java.lang.*;
import java.io.*;
class fillBag
 {
  public static int minCost(int arr[],int n,int k)
  {
    int dp[]=new int[k+1];
    Arrays.fill(dp,Integer.MAX_VALUE);
    dp[0]=0;
    for(int i=1;i<=k;++i)
    {
      for(int j=1;j<=n && j<=i;++j)
      {
        if(arr[j-1]!=-1 && dp[i-j]!=Integer.MAX_VALUE)
        dp[i]=Math.min(dp[i],arr[j-1]+dp[i-j]);
      }
    }
    return (dp[k]!=Integer.MAX_VALUE)?dp[k]:-1;
  }
 public static void main (String[] args)
  {
 Scanner ab=new Scanner(System.in);
 int t=ab.nextInt();
 while(t-->0)
 {
     int n=ab.nextInt();
     int k=ab.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;++i)
     arr[i]=ab.nextInt();
     System.out.println(minCost(arr,n,k));
 }
  }
}