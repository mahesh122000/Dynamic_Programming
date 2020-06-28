class Solution {
    public List<String> removeInvalidParentheses(String s) {
        int a[]=find(s);
        int left=a[0];
        int right=a[1];
        HashSet<String>hs=new HashSet<>();
        check(new char[s.length()-left-right],s,0,0,left,right,0,hs);
        return new ArrayList<String>(hs);
    }
    int[] find(String s)
    {
        int left=0,right=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                left++;
            else if(s.charAt(i)==')')
            {
                if(left>0)
                    left--;
                else
                    right++;
            }
        }
        return new int[]{left,right};
    }
    void check(char c[],String s,int k,int i,int left,int right,int val,HashSet<String>hs)
    {
        if(k==c.length)
        {
            if(val==0)
                hs.add(new String(c));
            return ;
        }
        if(i>=s.length())
            return;
        char ch=s.charAt(i);
        if(ch=='(')
        {
            if(left>0)
                check(c,s,k,i+1,left-1,right,val,hs);
            c[k]=ch;
            check(c,s,k+1,i+1,left,right,val+1,hs);
        }
        else if(ch==')')
        {
            if(right>0)
                check(c,s,k,i+1,left,right-1,val,hs);
            if(val>0)
            {
                c[k]=ch;
                check(c,s,k+1,i+1,left,right,val-1,hs);
            }
        }
        else
        {
            c[k]=ch;
            check(c,s,k+1,i+1,left,right,val,hs);
        }
    }
}




