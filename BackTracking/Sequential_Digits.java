class Solution {
    List<Integer>l;
    public List<Integer> sequentialDigits(int low, int high) {
        l=new ArrayList<>();
        for(int i=12;i<=89;i+=11)
            find(i,low,high);
        Collections.sort(l);
        return l;
    }
    void find(int i,int low,int high)
    {
        if(i>=low && i<=high)
            l.add(i);
        if(i>high)
            return;
        int n=i%10;
        if(n==9)
            return;
        find(i*10+n+1,low,high);
    }
}