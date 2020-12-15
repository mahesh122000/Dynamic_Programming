class Solution{
    static int ans;
    static boolean flag;
    static int countZero(int n){
        String s=Integer.toString(n);
        int l=s.length();
        ans=0;
        flag=false;
        for(int i=2;i<=l-1;i++)
        {
            ans+=9*((int)(Math.pow(10,i-1))-(int)(Math.pow(9,i-1)));
        }
        find(s,0,l);
        return ans;
    }
    static void find(String s,int i,int l)
    {
        //System.out.println(ans);
        if(i>=l)
        return ;
        int k=(int)(s.charAt(i)-'0');
            //System.out.println(k);
        if(i==l-1 && i!=0)
        {
            if(flag)
            {
                ans+=k+1;
            }
            else
            {
                ans++;
            }
            return;
        }
        for(int j=0;j<=9;j++)
        {
            if(i==0 && j==0)
            continue;
            if(k>j)
            {
                if(flag||j==0)
                ans+=(int)(Math.pow(10,l-i-1));
                else
                ans+=((int)(Math.pow(10,l-i-1))-(int)(Math.pow(9,l-i-1)));
            }
            else if(k==j)
            {
                if(j==0)
                flag=true;
                find(s,i+1,l);
            }
            else
            break;
        }
    }
}