#include <bits/stdc++.h>
using namespace std;
long long int max(long long int a, long long int b){
if(b>a)
return b;
return a;
}
long long int min(long long int a, long long int b){
if(a<b)
return a;
return b;
}

int main() {
	int t=0;
	cin>>t;
	while(t--)
	{
	    int n=0;
	    cin>>n;
	    int arr[n]={0};
	    for(int i=0;i<n;i++)
	    {
	           cin>>arr[i];
	    }
	     long long int curr_max=arr[0];
	     long long int curr_min=arr[0];
	     long long int prev_max=arr[0];
	     long long int prev_min=arr[0];
	     long long int ans=arr[0];
	    for(int i=1;i<n;i++)
	    {
	        curr_max=max(  max(prev_max*arr[i]%1000000007,prev_min*arr[i]%1000000007),arr[i]);
	        curr_min=min(  min(prev_max*arr[i]%1000000007,prev_min*arr[i]%1000000007),arr[i]);
	       ans=max(ans,curr_max);
	       prev_max=curr_max;
	       prev_min=curr_min;
	    }
	    cout<<ans<<endl;
	}
	return 0;
}
