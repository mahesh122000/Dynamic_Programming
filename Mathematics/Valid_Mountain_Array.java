class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        if(n<=2)
            return false;
        boolean flag1=false,flag2=false;
        int pre=arr[0];
        for(int i=1;i<n;i++)
        {
            if(pre<arr[i])
            {
                flag1=true;
                if(flag2==true)
                    return false;
            }
            else if(pre>arr[i])
            {
                flag2=true;
                if(flag1==false)
                    return false;
            }
            else
                return false;
            pre=arr[i];
        }
        return flag1&&flag2;
    }
}