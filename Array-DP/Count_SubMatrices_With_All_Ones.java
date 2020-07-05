class Solution {
    
    static class pair 
    {  
    int first, second;  
    public pair(int first, int second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
    }  
static void find(int b[][], int a[][]) 
{ 
    int n=a.length;
    int m=a[0].length;
    for (int i = 0; i < n; i++) 
    { 
        for (int j = m - 1; j >= 0; j--)  
        { 
            if (a[i][j]==0) 
                continue; 
  
            if (j != m- 1) 
                b[i][j] += b[i][j + 1]; 
  
            b[i][j] += a[i][j] ;
        } 
    } 
} 
  

    public int numSubmat(int[][] a) {
       int n=a.length;
        if(n==0)
            return 0;
        int m=a[0].length;
        if(m==0)
            return 0;
        int [][]b = new int[n][m]; 
  
    find(b, a);
    int ans = 0; 
    for (int j = 0; j < m; j++)  
    { 
        int i = n - 1;
        Stack<pair> q = new Stack<pair>(); 
        int to_sum = 0; 
  
        while (i >= 0)  
        { 
            int c = 0; 
  
            while (q.size() != 0 && 
                   q.peek().first > b[i][j])  
            { 
                to_sum -= (q.peek().second + 1) *  
                          (q.peek().first - b[i][j]); 
  
                c += q.peek().second + 1; 
                q.pop(); 
            } 
  
            to_sum += b[i][j]; 
  
            ans += to_sum; 
  
            q.add(new pair(b[i][j], c)); 
  
            i--; 
        } 
    } 
    return ans; 
    }
}