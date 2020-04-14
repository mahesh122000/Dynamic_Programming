void printJobScheduling(Job arr[], int n){
        Arrays.sort(arr,(p,q)->q.profit-p.profit);
        int count=0;
        HashSet<Integer>hs=new HashSet<>();
        int ans=0;
        hs.add(arr[0].deadline);
        ans+=arr[0].profit;
        count++;
        for(int i=1;i<n;i++)
        {int d=arr[i].deadline;
        for(int j=d;j>=1;j--)
        {if(!hs.contains(j))
        {hs.add(j);
        count++;
        ans+=arr[i].profit;
        break;
        }
        }
        }
        System.out.print(count+" "+ans);
    }