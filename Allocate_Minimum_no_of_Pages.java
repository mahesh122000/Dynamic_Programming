int main() {
	int t;
	cin>>t;
	 while(t--)
	 {
	     int n;
	     cin>>n;
	     long long int a[n];
	     long long int l=0;
	     long long int h=0;
	     for(int i=0;i<n;i++)
	     {cin>>a[i];
	     h+=a[i];
	     l=max(l,a[i]);
	     }
	     int k;
	     cin>>k;
	     int ans=-1;
	     while(l<=h)
	     {
	         long long int m=(l+h)>>1;
	         int count=1;
	         long long int v=0;
	         for(int i=0;i<n;i++)
	         {if(v+a[i]<=m)
	         v+=a[i];
	         else
	         {
	             v=a[i];
	             count++;
	         }}
	         if(count>k)
	         l=m+1;
	         else
	         {ans=m;
	         h=m-1;}
	     }
	     if(k>n)
	     cout<<"-1"<<endl;
	     else
	     cout<<ans<<endl;
	 }
	return 0;
}