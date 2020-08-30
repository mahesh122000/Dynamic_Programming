class Solution {
    public boolean isIdealPermutation(int[] a) {
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            if(Math.abs(a[i]-i)>1)
                return false;
        }
        return true;
    }
}