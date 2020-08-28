class Solution {
    static List<String>al;
    static HashSet<String>hs;
    public List<String> letterCasePermutation(String s) {
        al=new ArrayList<>();
        int n=s.length();
        hs=new HashSet<>();
        char c[]=s.toCharArray();
        for(int i=0;i<n;i++)
        {
            if(c[i]>='0' && c[i]<='9')
            {}
            else
            {
                char ch=c[i];
                find(c,i+1,n);
                c[i]=modify(ch);
                find(c,i+1,n);
                c[i]=ch;
                break;
            }
        }
        if(al.size()==0 && n>=1)
            al.add(s);
        return al;
    }
    void find(char c[],int i,int n)
    {
        if(!hs.contains(new String(c)))
        {
            al.add(new String(c));
            hs.add(new String(c));
        }
        if(i==n)
            return ;
        for(int j=i;j<n;j++)
        {
            if(c[j]>='0' && c[j]<='9')
            {}
            else
            {
                char ch=c[j];
                find(c,j+1,n);
                c[j]=modify(ch);
                find(c,j+1,n);
                c[j]=ch;
                break;
            }
        }
    }
    char modify(char c)
    {
        char s='a';
        if(c>='a' && c<='z')
            s=(char)(c-'a'+'A');
        else
            s=(char)(c-'A'+'a');
        return s;
    }
}