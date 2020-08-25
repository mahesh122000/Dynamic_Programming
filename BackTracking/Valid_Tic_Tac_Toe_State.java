class Solution {
    public boolean validTicTacToe(String[] board) {
        int x=0,o=0;
        for(String s:board)
        {
            for(int i=0;i<3;i++)
            {
                char c=s.charAt(i);
                if(c=='X')
                    x++;
                else if(c=='O')
                    o++;
            }
        }
        if(!((x==o)||(x==o+1)))
            return false;
        boolean f1=won(board,'X');
        boolean f2=won(board,'O');
        if((f1 && f2)||(f1 && x==o)||(f2 && x==o+1))
            return false;
        return true;
    }
    boolean won(String[] board,char c)
    {
        for(int i=0;i<3;i++)
        {
            if(board[i].charAt(0)==c && board[i].charAt(1)==c && board[i].charAt(2)==c)
                return true;
        }
        for(int i=0;i<3;i++)
        {
            if(board[0].charAt(i)==c && board[1].charAt(i)==c && board[2].charAt(i)==c)
                return true;
        }
        if(board[0].charAt(2)==c && board[1].charAt(1)==c && board[2].charAt(0)==c)
                return true;
        if(board[0].charAt(0)==c && board[1].charAt(1)==c && board[2].charAt(2)==c)
                return true;
        return false;
    }
}