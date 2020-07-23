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
	         int l=0;
	         int r=1;
	         while(r<n){
	         if(a[l]==a[r]&&a[l]!=0){
	            a[l] += a[l];
	            a[r]  = 0;
	         }
	         else if(a[l]!=a[r]&&a[r]!=0)
	            l = r;
	       
	         r++;
	        }
	    l=0;
	    r=-1;
	    
	    while(true){
	        while(l<n &&a[l]!=0)
	             l++;
	        if(r==-1)
	            r=l+1;
	        while(r<n &&a[r]==0)
	             r++;
	        if(l>r||l==n||r==n)
	            break;
	        a[l]=a[r];
	        a[r]=0;
	    }
	         for(int i=0;i<n;i++)
	         cout<<a[i]<<" ";
	         cout<<endl;
	     }
	return 0;
}