#include <iostream>
using namespace std;
#define lld long long int
 
lld dp[101][101][101],cnt[101][101][101];
 
int main()
{
	int t;
	cin>>t;
	for(int i1=0;i1<101;i1++)
	{
		for(int i2=0;i2<101;i2++)
		{
			for(int i3=0;i3<101;i3++)
			{
				dp[i1][i2][i3]=0;
				cnt[i1][i2][i3]=(!i1 && !i2 && !i3);
				if(i1)
				{
					dp[i1][i2][i3]=(dp[i1][i2][i3]+10*dp[i1-1][i2][i3]+4*cnt[i1-1][i2][i3])%1000000007;
					cnt[i1][i2][i3]=(cnt[i1][i2][i3]+cnt[i1-1][i2][i3])%1000000007;
				}
				if(i2)
				{
					dp[i1][i2][i3]=(dp[i1][i2][i3]+10*dp[i1][i2-1][i3]+5*cnt[i1][i2-1][i3])%1000000007;
					cnt[i1][i2][i3]=(cnt[i1][i2][i3]+cnt[i1][i2-1][i3])%1000000007;
				}
				if(i3)
				{
					dp[i1][i2][i3]=(dp[i1][i2][i3]+10*dp[i1][i2][i3-1]+6*cnt[i1][i2][i3-1])%1000000007;
					cnt[i1][i2][i3]=(cnt[i1][i2][i3]+cnt[i1][i2][i3-1])%1000000007;
				}
			}
		}
	}
	for(int iter=0;iter<t;iter++)
	{
		int x,y,z;
		cin>>x>>y>>z;
		lld sum=0;
		for(int i1=0;i1<=x;i1++)
		{
			for(int i2=0;i2<=y;i2++)
			{
				for(int i3=0;i3<=z;i3++)
				{
					sum=(sum+dp[i1][i2][i3])%1000000007;
				}
			}
		}
		cout<<sum<<endl;
	}
	return 0;
}