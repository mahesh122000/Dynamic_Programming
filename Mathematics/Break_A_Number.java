class Solution{
    static int waysToBreakNumber(int n){
        n++;
        return (n*(n+1))/2;
    }
}