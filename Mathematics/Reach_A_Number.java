class Solution {
    public int reachNumber(int n) {
        if(n<0)
            n=-1*n;
        int k=(int)(Math.sqrt(n));
        int val=(k*(k+1))/2;
        while(val<n||(val-n)%2!=0)
        {
            val+=(k+1);
            k++;
        }
        return k;
    }

}