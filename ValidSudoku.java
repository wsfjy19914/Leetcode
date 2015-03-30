

public class ValidSudoku {

	public boolean isValidSudoku(char[][] board) {
        if(board.length != 9 || board[0].length != 9)
            return false;
        
        for(int i = 0; i < 9; i ++)
        {
            for(int j = 0; j < 9; j ++)
            {
                if(board[i][j] == '.')
                    continue;
                for(int k = j + 1; k < 9; k ++)
                {
                    if (board[i][k] == board[i][j])
                    {
                    	System.out.println("horizontal");
                    	System.out.println(i + ", " + j + ", " + k);
                        return false;
                    }
                }
               
            }
        }
        
        for(int i = 0; i < 9; i ++)
        {
            for(int j = 0; j < 9; j ++)
            {
                if(board[j][i] == '.')
                    continue;
                for(int k = j + 1; k < 9; k ++)
                {
                    if (board[k][i] == board[j][i])
                    {
                    	System.out.println("vertical");
                    	System.out.println(i + ", " + j + ", " + k);
                        return false;
                    }
                }
            }
        }
        
        for(int i = 0; i < 9; i ++)
        {
            for(int j = 0; j < 9; j ++)
            {
                if(board[i][j] == '.')
                    continue;
                for(int k = 0; k < 3; k ++)
                {
                    for(int l = 0 ; l < 3; l ++)
                    {
                        if(i / 3 * 3 + k == i && j / 3 * 3 + l == j)
                            continue;
                        if(board[i / 3 * 3 + k][j / 3 * 3 + l] == board[i][j])
                        {
                        	System.out.println("area");
                        	System.out.println(i + ", " + j + ", " + k + ", " + "l");
                            return false;
                        }
                    }
                }
            }
        }
        
        return true;
        
    }

}
