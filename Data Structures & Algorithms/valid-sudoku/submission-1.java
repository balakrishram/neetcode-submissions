class Solution {
    public boolean checkBox(int rowStart, int rowEnd,int colStart, int colEnd,char[][] board){
        ArrayList<Character>arr = new ArrayList<>();
        for(int x = rowStart; x <= rowEnd; x++){
            for(int y = colStart; y<=colEnd; y++){
                char b = board[x][y];
                if(b != '.'){
                    if(arr.contains(b)){
                        return false;
                    }
                    arr.add(b);
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            ArrayList<Character>arr = new ArrayList<>();
            ArrayList<Character>arr2 = new ArrayList<>();
            for(int j = 0; j < 9; j++){
                char x = board[i][j];
                if(x != '.'){
                    if(arr.contains(x)){
                        return false;
                    }
                    arr.add(x);
                }
                char y = board[j][i];
                if(y != '.'){
                    if(arr2.contains(y)){
                        return false;
                    }
                    arr2.add(y);
                }
            }
        }

        if(checkBox(0,2,0,2,board) == false) return false;
        if(checkBox(0,2,3,5,board) == false) return false;
        if(checkBox(0,2,6,8,board) == false) return false;
        if(checkBox(3,5,0,2,board) == false) return false;
        if(checkBox(3,5,3,5,board) == false) return false;
        if(checkBox(3,5,6,8,board) == false) return false;
        if(checkBox(6,8,0,2,board) == false) return false;
        if(checkBox(6,8,3,5,board) == false) return false;
        if(checkBox(6,8,6,8,board) == false) return false;
        return true;
    }
}