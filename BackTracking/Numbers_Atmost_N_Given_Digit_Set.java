class Solution {
    ArrayList<Integer>al;
    static int count;
    public int atMostNGivenDigitSet(String[] digits, int n) {
        count=0;
        al=new ArrayList<>();
        int a[]=new int[digits.length];
        for(int i=0;i<digits.length;i++)
            a[i]=Integer.parseInt(digits[i]);
        while(n>0)
        {
            al.add(0,n%10);
            n=n/10;
        }
        for(int i=1;i<al.size();i++)
        {
            count+=Math.pow(a.length,i);
        }
        find(a,0);
        return count;
    }
    void find(int a[],int i)
    {
        if(i==al.size())
            return;
        if(al.get(i)==0)
            return;
        for(int j=0;j<a.length;j++)
        {
            if(a[j]<al.get(i))
                count+=Math.pow(a.length,al.size()-i-1);
            else if(a[j]==al.get(i))
            {
                find(a,i+1);
                if(i+1==al.size())
                    count++;
            }
            else
                break;
        }
    }
    
}