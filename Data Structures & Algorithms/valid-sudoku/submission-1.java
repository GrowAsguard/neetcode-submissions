class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> set = new HashSet<>();
        //row level
        for (int i=0; i<9; i++) {
            set.clear();
            for (int j=0; j<9; j++) {
                char c = board[i][j];
                if (c == '.') continue;
                if (!set.add(c)) return false;
            }
        }
        set.clear();

        //column level
        for (int i=0; i<9; i++) {
            set.clear();
            for (int j=0; j<9; j++) {
                char c = board[j][i];
                if (c == '.') continue;
                if (!set.add(c)) return false;
            }
        }
        set.clear();

        //box level
        for (int boxRow=0; boxRow<9; boxRow+=3) {
            for (int boxCol=0; boxCol<9; boxCol+=3) {
                set.clear();
                for (int i=0; i<3; i++) {
                    for (int j=0; j<3; j++) {
                        char c = board[i+boxRow][j+boxCol];
                        if (c == '.') continue;
                        if (!set.add(c)) return false;
                    }
                }
            }
        }

        return true;
    }
}
