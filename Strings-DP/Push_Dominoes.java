class Solution {
    public String pushDominoes(String s) {
        int n=s.length();
        char c[]=s.toCharArray();
        for(int i=0;i<n;)
        {
            if(c[i]=='.')
            {
                i++;
            }
            else if(c[i]=='L')
            {
                int j=i-1;
                while(j>=0)
                {
                    if(c[j]=='.')
                        c[j]='L';
                    else
                        break;
                    j--;
                }
                i++;
            }
            else
            {
                int j=i+1;
                while(j<n && c[j]=='.')
                {
                    j++;
                }
                if(j<n && c[j]=='R')
                {
                    while(i<j)
                    {
                        c[i]='R';
                        i++;
                    }
                }
                else if(j<n && c[j]=='L')
                {
                    int start=i+1;
                    int end=j-1;
                    while(start<end)
                    {
                        c[start++]='R';
                        c[end--]='L';
                    }
                    i=j+1;
                }
                else if(j==n)
                {
                    while(i<n)
                    {
                        c[i++]='R';
                    }
                }
            }
        }
        return new String(c);
    }
}