class Solution {
    public boolean escapeGhosts(int[][] g, int[] t) {
        int val=Math.abs(t[0])+Math.abs(t[1]);
        for(int i=0;i<g.length;i++)
        {
            int temp=0;
            if((g[i][0]<0 && t[0]>0)||(g[i][0]>0 && t[0]<0))
                temp+=Math.abs(g[i][0])+Math.abs(t[0]);
            else
                temp+=Math.abs(g[i][0]-t[0]);
            if((g[i][1]<0 && t[1]>0)||(g[i][1]>0 && t[1]<0))
                temp+=Math.abs(g[i][1])+Math.abs(t[1]);
            else
                temp+=Math.abs(g[i][1]-t[1]);
            if(temp<=val)
                return false;
        }
        return true;
    }
}