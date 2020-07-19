class Solution {
    public int[][] outerTrees(int[][] a) {
        Arrays.sort(a,(p,q)->p[0]==q[0]?p[1]-q[1]:p[0]-q[0]);
        Stack<int[]>st=new Stack<>();
        int n=a.length;
        //ignore the point through which cross product is <0. 
        for(int i=0;i<n;i++)
        {
            while(st.size()>1 && crossProduct(st.get(st.size()-2),st.peek(),a[i])<0)
                st.pop();
            st.push(a[i]);
        }
        if(st.size()==n)
            return st.toArray(new int[n][]);
        for(int i=n-2;i>=0;i--)
        {
            while(st.size()>1 && crossProduct(st.get(st.size()-2),st.peek(),a[i])<0)
                st.pop();
            st.push(a[i]);
        }
        st.pop();
        return st.toArray(new int[st.size()][]);
    }
    int crossProduct(int a[],int b[],int c[])
    {
        return (a[0]-b[0])*(b[1]-c[1])-(b[0]-c[0])*(a[1]-b[1]);
    }
}


