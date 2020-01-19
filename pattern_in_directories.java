import java.util.Scanner;

public class Main {
    
    public static boolean ans(String a,String b)
    {
        int n=a.length();
        int m=b.length();
        boolean aa[][]=new boolean[n+1][m+1];
        aa[0][0]=true;
        for(int i=1;i<=n;i++)
            aa[i][0]=false;
        for(int i=1;i<=m;i++)
        {if(b.charAt(i-1)=='*')
         aa[0][i]=aa[0][i-1];}    
        for(int i=1;i<=n;i++)
        {for(int j=1;j<=m;j++)
        {if(a.charAt(i-1)==b.charAt(j-1))
         aa[i][j]=aa[i-1][j-1];
        else if(b.charAt(j-1)=='*')
            aa[i][j]=aa[i-1][j]||aa[i][j-1];
        else
         aa[i][j]=false;}}
        return aa[n][m];
        
    }

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        String c=s.next();
        while(t-->0)
        {String a=s.next();
        if(ans(a,c))
         System.out.println("YES");
        else
         System.out.println("NO");}

	}

}