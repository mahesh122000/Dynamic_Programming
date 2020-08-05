#include <iostream>
using namespace std;

int main() {
	int t;
	cin>>t;
	while(t--)
	{
	    int n;
	    cin>>n;
	    int a[n];
	    for(int i=0;i<n;i++)
	    cin>>a[i];
	    int i=0,j=n-1;
	    int k;
	    cin>>k;
	    bool flag=false;
	    while(i<j)
	    {
	        if(a[i]+a[j]==k)
	        {
	            cout<<a[i]<<" "<<a[j]<<" "<<k<<endl;
	            flag=true;
	            i++;
	        }
	        else if(a[i]+a[j]>k)
	        {
	            j--;
	        }
	        else
	        {
	            i++;
	        }
	    }
	    if(flag==false)
	    cout<<"-1"<<endl;
	}
	return 0;
}