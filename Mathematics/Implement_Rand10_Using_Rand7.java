class Solution extends SolBase {
    public int rand10() {
        int val=49;
        while(val>=40)
        {
            val=7*(rand7()-1)+rand7()-1;
        }
        return val%10+1;
    }
}