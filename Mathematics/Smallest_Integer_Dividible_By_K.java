class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%2==0 || k%5==0)
            return -1;
        int val=0;
        for(int i=1;i<=k;i++)
        {
            val=(val*10+1)%k;
            if(val==0)
                return i;
        }
        return -1;
    }
}