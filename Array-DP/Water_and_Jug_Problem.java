class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        if(x+y<z)
            return false;
        if(x==0 && y==0)
        {if(z==0)
         return true;
        return false;}
        if(x==0)
        {
            if(y==z||z==0)
                return true;
            return false;
        }
        if(y==0)
        {
            if(x==z||z==0)
                return true;
            return false;
        }
        if(x+y==z)
            return true;
        int k=gcd(x,y);
        return z%k==0;
    }
    public int gcd(int x,int y)
    {
        if(y==0)
            return x;
        return gcd(y,x%y);
    }
}


