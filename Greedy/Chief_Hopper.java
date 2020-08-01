static int chiefHopper(int[] a) {
        int n=a.length;
        int ans=0;
        for(int i=n-1;i>=0;i--)
        {
            int val=ans+a[i];
            if(val%2==1)
            val++;
            ans=val/2;
        }
        return ans;
    }