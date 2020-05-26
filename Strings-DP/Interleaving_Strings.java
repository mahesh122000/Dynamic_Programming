public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length())
            return false;
        boolean a[][]=new boolean[s1.length()+1][s2.length()+1];
        a[0][0]=true;
        for(int i=1;i<=s1.length();i++)
          a[i][0]=s1.charAt(i-1)==s3.charAt(i-1) && a[i-1][0];
        for(int i=1;i<=s2.length();i++)
          a[0][i]=s2.charAt(i-1)==s3.charAt(i-1) && a[0][i-1];
        for(int i=1;i<=s1.length();i++)
        {for(int j=1;j<=s2.length();j++)
        {a[i][j]=(s1.charAt(i-1)==s3.charAt(i+j-1) && a[i-1][j])||(s2.charAt(j-1)==s3.charAt(i+j-1) && a[i][j-1]);
        }}
        return a[s1.length()][s2.length()];
    }