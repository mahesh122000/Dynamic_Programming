class Solution
{
	public long getCount(int n)
	{
		if(n==0)
		return 0;
		if(n==1)
		return 10;
		long a[][][]=new long[4][3][n];
		for(int i=0;i<3;i++)
		{
		    for(int j=0;j<3;j++)
		    {
		        a[i][j][0]=1;
		    }
		}
		a[3][1][0]=1;
		for(int k=1;k<n;k++)
		{
		    for(int i=0;i<4;i++)
		    {
		        for(int j=0;j<3;j++)
		        {
		            long val=a[i][j][k-1];
		            if(i==3 && j==1)
		            {
		                val+=a[i-1][j][k-1];
		            }
		            else
		            {
		                if(j-1>=0)
		                {
		                    val+=a[i][j-1][k-1];
		                }
		                if(j+1<3)
		                {
		                    val+=a[i][j+1][k-1];
		                }
		                if(i-1>=0)
		                {
		                    val+=a[i-1][j][k-1];
		                }
		                if(i+1<4)
		                {
		                    if(i!=3|| (i==3 && j==1))
		                    {
		                        val+=a[i+1][j][k-1];
		                    }
		                }
		            }
		            if(i!=3|| (i==3 && j==1))
		            {
		                a[i][j][k]=val;
		            }
		            else
		            {
		                a[i][j][k]=0;
		            }
		        }
		    }
		}
		long ans=0;
		for(int i=0;i<4;i++)
		{
		    for(int j=0;j<3;j++)
		    {
		        ans+=a[i][j][n-1];
		    }
		}
		return ans;
	}
}