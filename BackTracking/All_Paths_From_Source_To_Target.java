class Solution {
    static List<List<Integer>>ans;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ans=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        int n=graph.length-1;
        int b[]=new int[n+1];
        b[0]=1;
        l.add(0);
        for(int i=0;i<graph[0].length;i++)
        {
            l.add(graph[0][i]);
            b[graph[0][i]]=1;
            find(graph,graph[0][i],n,l,b);
            b[graph[0][i]]=0;
            l.remove(l.size()-1);
        }
        if(ans.size()==0)
        {
            ans.add(l);
        }
        return ans;
    }
    void find(int a[][],int i,int n,List<Integer>l,int b[])
    {
        if(i==n)
        {
            List<Integer>ll=new ArrayList<>();
            ll.addAll(l);
            ans.add(ll);
            return;
        }
        for(int j=0;j<a[i].length;j++)
        {
            if(b[a[i][j]]==0)
            {
                l.add(a[i][j]);
                b[a[i][j]]=1;
                find(a,a[i][j],n,l,b);
                b[a[i][j]]=0;
                l.remove(l.size()-1);
            }
        }
    }
}