class Solution {
    public int countPalindromicSubsequences(String s) {
        int n=s.length();
        int a[][]=new int[n][n];
        int mod=1000000007;
        for(int i=0;i<n;i++)
            a[i][i]=1;
        for(int l=2;l<=n;l++)
        {
            for(int i=0;i<n-l+1;i++)
            {
                int j=i+l-1;
                if(s.charAt(i)==s.charAt(j))
                {
                    a[i][j]=2*a[i+1][j-1];
                    int left=i+1,right=j-1;
                    while(left<=right && s.charAt(i)!=s.charAt(left))
                        left++;
                    while(left<=right && s.charAt(i)!=s.charAt(right))
                        right--;
                    if(left<right)
                        a[i][j]-=a[left+1][right-1];
                    else if(left==right)
                        a[i][j]+=1;
                    else
                        a[i][j]+=2;
                }
                else
                {
                    a[i][j]=a[i+1][j]+a[i][j-1]-a[i+1][j-1];
                }
                a[i][j]=(a[i][j]<0)?a[i][j]+mod:a[i][j]%mod;
            }
        }
        return a[0][n-1];
    }
}

