class Solution {
    public int lengthLongestPath(String input) {
        String path[]=input.split("\n");
        int levels[]=new int[path.length];
        int ans=0;
        for(int i=0;i<path.length;i++)
        {
            boolean isFile=false;
            int level=0;
            int length=0;
            for(int j=0;j<path[i].length();j++)
            {
                char c=path[i].charAt(j);
                if(c=='.')
                    isFile=true;
                if(c=='\t')
                    level++;
                else
                    length++;
            }
            int val=(level==0)?0+length:(levels[level-1]+1+length);
            if(isFile)
            {
                ans=Math.max(ans,val);
            }
            else
            {
                levels[level]=val;
            }
        }
        return ans;
    }
}


