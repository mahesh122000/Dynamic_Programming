void find(char a[],int *p,int n,int &maxi,int &index)
{
    int left_boundary = 0 , right_boundary = 0, center = 0;
    int i=0,max_lps = 0,mirror;
    
    while(i<n+1 && right_boundary<n && max_lps<n-i)
    {
         i += 1;
        
        mirror = 2* center - i;

        if(i<right_boundary)
            p[i] = min(right_boundary-i,p[mirror]);
        
        while(a[i+p[i]+1] == a[i-(p[i]+1)])
            p[i] += 1;
        
        if(i+p[i]>right_boundary)
        {
            right_boundary = i + p[i];
            center = i;
        }

        if(p[i]>max_lps)
        {
            max_lps = p[i];
            maxi = p[i];
            index = i;
        }
    }

}


string LongestPalindromeSubString(string s)
{
    int n = s.size();
    int p[((2*n)+3)] = {0};
    char a[((2*n)+3)];
    int j = 0,i;
    int maxi = 0;
    int index = 0;
    for(i=1;i<2*n;i+=2)
    {
        a[i] = '#';
        a[i+1] = s[j];
        j += 1; 
    }
    a[0] = '(';
    a[(2*n)+1] = '#';
    a[(2*n)+2] = ')';
    find(a,p,(2*n)+1,maxi,index);

    int left,right;
    string ans;
    if(maxi&1)
    {
        ans = a[index];
        left = index-2;
        right = index+2;
    }
    else
    {
        left = index-1;
        right = index+1;
    }

    maxi = maxi/2;

    while(maxi--)
    {
        ans = a[left] + ans;
        ans = ans + a[right];
        left -= 2;
        right += 2;
    }

    return ans;
}
