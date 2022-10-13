import java.util.*;
public class Board {
    int size;
    String[][] board;
    HashMap<String, Jumper> jumpers;
    Board(int size, HashMap<String, Jumper> jumpers) {
        this.size = size;
        int no = 1;
        int dirn = 0;
        board = new String[size][size];
        for(int r = size - 1; r >= 0; r --) {
            if(dirn == 0) 
                for(int c = 0; c < size; c ++) board[r][c] = "" + (no ++);
            else 
                for(int c = size - 1; c >= 0; c --) board[r][c] = no ++ + "";
            dirn = (dirn + 1) % 2;
        }
        this.jumpers = jumpers;
    }

    @Override 
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i ++) {
            for(int j = 0; j < size; j ++) {
                sb.append(board[i][j] + "\t");
            }
            sb.append("\n\n");
        }
        return sb.toString();
    }
}