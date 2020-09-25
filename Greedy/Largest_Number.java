class Solution {
    public String largestNumber(int[] nums) {
        String arr[]=new String[nums.length];
        for(int i=0;i<nums.length;i++)
            arr[i]=Integer.toString(nums[i]);
        Arrays.sort(arr,(p,q)->(q+p).compareTo(p+q));
        String ans="";
        for(String s:arr)
        ans+=s;
        if(ans.charAt(0)=='0')
            return "0";
        return ans;
    }
}