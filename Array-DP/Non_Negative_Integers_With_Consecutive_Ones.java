class Solution {
    
    public int findIntegers(int num) {
        int fib[]=new int[32];
        //fib gives the no of possible numbers without consecutive ones till 2^n-1.
        fib[0]=1;
        fib[1]=2;
        for(int i=2;i<32;i++)
            fib[i]=fib[i-1]+fib[i-2];
        int count=0;
        //if two consecutive ones are found then no need to consider for the remaining. 
        for(int i=30;i>=0;i--)
        {
            if((1<<i&num)>0)
            {
                count+=fib[i];
                if((1<<i+1&num)>0)
                    return count;
            }
        }
        return count+1;
    }
    
}