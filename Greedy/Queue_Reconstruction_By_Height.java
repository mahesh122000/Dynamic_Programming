class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(p,q)->p[0]!=q[0]?q[0]-p[0]:p[1]-q[1]);
        List<int[]>l=new LinkedList<>();
        for(int x[]:people)
            l.add(x[1],x);
        return l.toArray(new int[people.length][]);
    }
}