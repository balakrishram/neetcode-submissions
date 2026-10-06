class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            for(int j = 0; j < 9; j++){
                char x = board[i][j];
                if(x != '.'){
                    if(row.contains(x)){
                        return false;
                    }
                    row.add(x);
                }
                char y = board[j][i];
                if(y != '.'){
                    if(col.contains(y)){
                        return false;
                    }
                    col.add(y);
                }
            }
        }
        HashMap<String,HashSet<Character>> map = new HashMap<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char x = board[i][j];
                if(x != '.'){
                    if(map.containsKey((i/3)+"-"+(j/3)) && map.get((i/3)+"-"+(j/3)).contains(x)){
                        return false;
                    }
                    if(!map.containsKey((i/3)+"-"+(j/3))){
                        map.put((i/3)+"-"+(j/3),new HashSet<>());
                        map.get((i/3)+"-"+(j/3)).add(x);
                    } else {
                        map.get((i/3)+"-"+(j/3)).add(x);
                    }
                    
                }
            }
        }

        return true;
    }
}