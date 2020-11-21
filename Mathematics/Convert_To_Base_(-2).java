class Solution {
    public String baseNeg2(int n) {
        if(n==0)
            return "0";
        StringBuilder sb=new StringBuilder();
        while(n!=0)
        {
            int mod=n%-2;
            System.out.print(mod+" ");
            if(mod<0)
                mod=1;
            sb.append(mod);
            n-=mod;
            n/=-2;
            System.out.println(n+" ");
        }
        return sb.reverse().toString();
    }
}