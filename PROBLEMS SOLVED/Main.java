class Soution{
    static boolean emptycell(char[][] board , int [] emptycell){

        for(int i = 0; i < 9 ; i++){
            for(int j = 0; j < 9 ; j++){
                if(board[i][j] == '.'){
                    emptycell[0] = i;
                    emptycell[1] = i;
                    return true;
                }
            }

        }

        // kahain bhi empty cell nahi mila to false kar dega
        return false;
    }

    static boolean issafetoplace(char[][] board , char charvalue, int rowindex, int colsindex){
        // check for horizontal row or same row
        // row ka index sab celll ke liye same rahega sur column ka index 0 se < 9 change hota rahega
        for (int cols = 0; cols < 9 ; cols++){
            if(board[rowindex][cols] == charvalue){
                return false;
            }
        }

        // check for vertical column or same column 
        for (int row = 0 ; row < 9 ; row++){
            if(board[row][colsindex] == charvalue){
                return false;
            }
        }
        // check for the 3 * 3 box is same element placed or not 
        // isme dimaga legaga imp 
        // for traverse all the boxex in 3 * 3  first we have to have the starting roww and starting cols
        // starting row = row - row % 3
        //starting cols = col - col % 3

        int startrow = rowindex - rowindex % 3;
        int startcol = colsindex - colsindex % 3;


        // Now travel 3 * 3 wala sub box

        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                int actualrow = startrow + i;
                int actualcol = startcol + j;
                if(board[actualrow][actualcol] == charvalue){
                    // iska matlab ek charvalue padhi hai aur value repeat kar rahi hai 
                    return false;
                }

            }

        }
        return true;
    }
    static boolean solver(char[][] board){
        // maein tab manuga tab mera saare empty boxes fill ho jaye 

        int[] emptycell = new int[2];
        if(!emptycell(board,emptycell)){
            return true;
        }


        // let say i have an empty cell than what to do
        int rowindex = emptycell[0];
        int colsindex = emptycell[1];

        if(int value = 1; value <=9 ; value++){
            char charvalue = (char)(value + '0');
            if(issafetoplace(board, charvalue, rowindex, colsindex)){
                // if safe to place than pl;ace the value
                board[rowindex][colsindex] = charvalue;

                // baki recursion samallega
                if(solver(board) == true){
                    return true;
                }

                // agar recursion nahi solve kar apaya 
                // to backtrscking karo aur empty cell return karo
                board[rowindex][colsindex] = '.';
            }

        }
        // then not able to solve the problem problem not solved
        return false;

    }
    public void sodukusolver(char[][] board){
        solver(board);
    }
}