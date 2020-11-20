class Solution {
    int[] sumClosest(int[] a, int x) {
        int i=0,j=a.length-1;
        int b[]=new int[2];
        int min=x;
        while(i<j)
        {
            int sum=a[i]+a[j];
            if(min>Math.abs(x-sum))
            {
                b[0]=a[i];
                b[1]=a[j];
                min=Math.abs(x-sum);
            }
            
            if(sum<x)
            i++;
            else if(sum>x)
            j--;
            else
            return b;
        }
        return b;
    }
}