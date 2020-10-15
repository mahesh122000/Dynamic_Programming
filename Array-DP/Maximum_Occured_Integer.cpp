int main() {
	int t;
	cin>>t;
	while(t-->0)
	{
	    int n;
	    cin>>n;
	    int l[n],r[n];
	    int maxx=0;
	    for(int i=0;i<n;i++)
	    {
	        cin>>l[i];
	        maxx=max(maxx,l[i]);
	    }
	    for(int i=0;i<n;i++)
	    {
	        cin>>r[i];
	        maxx=max(maxx,r[i]);
	    }
	    int a[maxx+10]={0};
	    for(int i=0;i<n;i++)
	    {
	        a[l[i]]+=1;
	        a[r[i]+1]-=1;
	    }
	    int ans=0,m=a[0];
	    for(int i=1;i<=maxx+4;i++)
	    {
	        a[i]+=a[i-1];
	        if(a[i]>m)
	        {
	            a[i]=m;
	            ans=i;
	        }
	    }
	    cout<<ans<<endl;
	}
	return 0;
}