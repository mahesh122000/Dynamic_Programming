class Solution {
    int n;
    long m;
    
    public int reverse(int x) {
        if(m!=n){
            return 0;
        }
        if(x==0){
            return n;
        }
        
        n = n*10 + x%10;
        m = m*10 + x%10;
        return reverse(x/10);
    }
}