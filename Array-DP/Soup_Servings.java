class Solution {
    static HashMap<String,Double>hm;
    static int A[]={100,75,50,25};
    static int B[]={0,25,50,75};
    public double soupServings(int n) {
        if(n>4800)
            return 1.0;
        hm=new HashMap<>();
        return find(n,n);
    }
    double find(int a,int b)
    {
        if(a<=0 && b<=0)
            return 0.5;
        if(b<=0)
            return 0.0;
        if(a<=0)
            return 1.0;
        String c=a+"$"+b;
        if(hm.containsKey(c))
            return hm.get(c);
        double prob=0.0;
        for(int i=0;i<4;i++)
        prob+=0.25*find(a-A[i],b-B[i]);
        hm.put(c,prob);
        return prob;
    }
}