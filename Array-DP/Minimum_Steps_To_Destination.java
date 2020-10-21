static int minSteps(int d){
        int val=1;
        if(d<=1)
        return d;
        int sum=0;
        while(true)
        {
            sum+=val;
            if(sum==d)
            return val;
            if(sum>d &&(sum-d)%2==0)
            return val;
            val++;
        }
    }