#include<iostream>
#include<bits/stdc++.h>
#include<algorithm>
using namespace std;
int main()
 {
	int t;
	cin>>t;
	
	for(int z{0};z<t;z++)
	{
	
	 int n,k;
	 cin>>n>>k;
	 string s;
	 cin>>s;
	 unordered_map<char,int> umap;
	
	 int start=0;
	 int maxrepeatletter=0;
	 int ans=0;
	 
	 for(int i=0;i<s.length();i++)
	 {
	     umap[s[i]]++;
	     maxrepeatletter=max(maxrepeatletter,umap[s[i]]);
	     
	     if(i-start+1-maxrepeatletter>k)
	     {
	         umap[s[start]]--;
	         start++;
	     }
	     ans=max(ans,i-start+1);

	 }
	 cout<<ans<<"\n";
	}
	return 0;
}