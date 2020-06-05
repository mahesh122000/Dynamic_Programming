class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        List<String>al=new ArrayList<>();
        for(String s:words)
        {if(found(s,board))
         al.add(s);
        }
        return al;
    }
    public boolean found(String s,char a[][])
    {
        if(s.length()<=0)
            return false;
        for(int i=0;i<a.length;i++)
        {for(int j=0;j<a[0].length;j++)
        {if(s.charAt(0)==a[i][j])
        {if(backtrack(s,a,0,i,j))
         return true;
        }}}
        return false;
    }
    public boolean backtrack(String s,char a[][],int k,int i,int j)
    { 
        if(k==s.length())
            return true;
        if(i<0|j<0|i>=a.length|j>=a[0].length)
            return false;
        if(s.charAt(k)!=a[i][j])
            return false;
        boolean ans=false;
        char c=a[i][j];
        a[i][j]='#';
        ans=backtrack(s,a,k+1,i+1,j)|backtrack(s,a,k+1,i,j+1)|backtrack(s,a,k+1,i-1,j)|backtrack(s,a,k+1,i,j-1);
        a[i][j]=c;
        return ans;
    }
}