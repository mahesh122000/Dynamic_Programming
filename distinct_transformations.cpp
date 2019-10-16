#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        string s1;
        string s2;
        cin>>s1>>s2;
        
        int len1 = s1.length();
        int len2 = s2.length();
        
        int dp[len2+1][len1+1];
        
        memset(dp,0,sizeof(dp));
        
        for(int i=0;i<len1+1;i++)
        dp[0][i]=1;
        
        
        
        for(int i=1;i<len2+1;i++)
        {
            for(int j=1;j<len1+1;j++)
            {
                if(s1[j-1]==s2[i-1])
                {
                   dp[i][j]  = dp[i-1][j-1];
                }
                
                dp[i][j] += dp[i][j-1];
            }
        }
        
        cout<<dp[len2][len1]<<endl;
	    
	    
	    
// Another approach is:
	    
	    
#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        string s1;
        string s2;
        cin>>s1>>s2;
        
        int len1 = s1.length();
        int len2 = s2.length();
        
        int dp[len1+1][len2+1];
        
        memset(dp,0,sizeof(dp));
        
        for(int i=0;i<len1+1;i++)
        dp[i][0]=1;
        
        
        
        for(int i=1;i<len1+1;i++)
        {
            for(int j=1;j<len2+1;j++)
            {
                if(s1[i-1]==s2[j-1])
                {
                   dp[i][j]  = dp[i-1][j-1]+dp[i-1][j];
                }
                else
                  dp[i][j] = dp[i-1][j];
            }
        }
        
        cout<<dp[len1][len2]<<endl;
        
    }
	
	return 0;
}
        
    }
	
	return 0;
}
