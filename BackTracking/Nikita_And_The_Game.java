static int arraySplitting(int[] a,int l,int h) {
        long sum=0;
        if((l==h)||(l>h))
        return 0;
        for(int i=l;i<=h;i++)
        sum+=a[i];
        if(sum%2==1)
        return 0;
        long k=sum/2;
        long val=0;
        int ind=-1;
        for(int i=l;i<=h;i++)
        {
            val+=a[i];
            if(val==k)
            {
                ind=i;
                break;
            }
            if(val>k)
            break;
        }
        if(ind==-1)
        return 0;
        return 1+Math.max(arraySplitting(a,l,ind),arraySplitting(a,ind+1,h));
    }