class Solution {
    public int poorPigs(int n, int minutesToDie, int minutesToTest) {
        int t=minutesToTest/minutesToDie;
        int x=(int)Math.ceil(Math.log(n)/Math.log(t+1));
        return x;
    }
}

//(T+1)^X>=N