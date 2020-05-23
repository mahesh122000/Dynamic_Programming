 static long substrCount(int n, String s) {
    int count=n;
    int l=0,h=0;
    for(int i=0;i<n-1;i++)
    {l=i;
    h=i+1;
    while(l>=0 && h<n && s.charAt(l)==s.charAt(h) && s.charAt(l)==s.charAt(l+1))
    {count++;
    l--;
    h++;}
    l=i-1;
    h=i+1;
    while(l>=0 && h<n && s.charAt(l)==s.charAt(h))
    {if(h-l!=2 && s.charAt(l)==s.charAt(l+1))
    {count++;
    l--;
    h++;}
    else if(h-l==2)
    {count++;
    l--;
    h++;}
    else
    break;
    }}
    return count;
    }