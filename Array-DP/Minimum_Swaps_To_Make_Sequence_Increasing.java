class Solution {
    public int minSwap(int[] a, int[] b) {
        int n=a.length;
        int swap=1,no_swap=0;
        for(int i=1;i<n;i++)
        {
            int new_swap=Integer.MAX_VALUE,new_no_swap=Integer.MAX_VALUE;
            if(a[i-1]<a[i] && b[i-1]<b[i]){
                new_swap = Math.min(new_swap, swap+1);
                new_no_swap = Math.min(new_no_swap, no_swap);
            }
            
            if(b[i-1]<a[i] && a[i-1]<b[i]){
                new_swap = Math.min(new_swap, no_swap+1);
                new_no_swap = Math.min(new_no_swap, swap);
            }
            
            swap=new_swap;
            no_swap=new_no_swap;
        }
        return Math.min(swap,no_swap);
    }
}

