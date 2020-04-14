 double fractionalKnapsack(int W, Item arr[], int n) {
        Arrays.sort(arr,new MySort());
        int i=0;
        double ans=0;
        while(W>0 && i<n)
        {if(W-arr[i].weight>=0)
        {ans+=arr[i].value;
        W-=arr[i].weight;
        }
        else 
        {ans+=W*((double)arr[i].value/(double)arr[i].weight);
        W=0;
        }
        i++;
        }
        return ans;
    }