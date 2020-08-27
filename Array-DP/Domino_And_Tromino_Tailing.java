class Solution {
    public int numTilings(int n) {
        if(n<=2)
            return n;
        if(n==3)
            return 5;
        int a[]=new int[n+1];
        int mod=1000000007;
        a[1]=1;
        a[2]=2;
        a[3]=5;
        for(int i=4;i<=n;i++)
        {
            a[i]=(2*(a[i-1]%mod)%mod+(a[i-3]%mod))%mod;
        }
        return a[n];
    }
}

//f(n)=f(n-1)+f(n-2)+g(n-1)
//g(n)=g(n-1)+2*f(n-2)
//f(n-1)-add vertical, f(n-2)-add two horizontal, g(n-1)-add tromino
//g(n-1)-add horizontal, f(n-2)-add two types of trominoes