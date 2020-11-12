class Solution 
{ 
    static int threeSumClosest(int[] arr, int target)  
	{ 
        Arrays.sort(arr);
        int res=0;
        int n=arr.length;
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++){
            int low=i+1;
            int high=n-1;
           int sum=0;
            while(low<high){
                sum=arr[low]+arr[high]+arr[i];
                int currDiff=Math.abs(target-sum);
                if(currDiff<=diff){
                    if(currDiff==diff&&sum<res){
                        //do nothing
                    }else{
                    res=sum;
                    diff=currDiff;  
                        
                    }
                }                       //we will make program of finding a triplet only.however, in
                                        //every iteration we will check for the diff of current triplet
                                        //and update if the curr diff is smaller then the prev diff.
                if(sum<target){
                    low++;
                }else if(sum>target){
                    high--;
                }
                else
                    return res;

            }
        }
        return res;
        
	} 
} 