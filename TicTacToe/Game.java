import java.util.*;
public class Game {
    Player[] players;
    Board board;
    int turn;
    int noOfMoves;
    boolean gameOver;
    String zero;
    String cross;

    Scanner scn = new Scanner(System.in);

    public Game(Player[] players, Board board) {
        this.players = players;
        this.board = board;
        this.turn = 0;
        this.noOfMoves = 0;
        this.gameOver = false;
        StringBuilder z = new StringBuilder(), c = new StringBuilder();
        for(int i = 0; i < board.size; i ++) {
            z.append("O");
            c.append("X");
        }
        zero = z.toString();
        cross = c.toString();
    }

    public void printBoard() {
        for(char[] oneD : board.board) {
            for(char c : oneD) {
                System.out.print(c +  " ");
            }
            System.out.println();
        }
    }

    public void play() {
        printBoard();
        while(!this.gameOver) {
            this.noOfMoves ++;
            int idx = getIndex(); //get Valid Index
            int row = idx / board.size;
            int col = idx % board.size;
            board.board[row][col] = players[turn].getSymbol();
            if(this.noOfMoves = board.size * board.size) return;
            if(noOfMoves >= 2 * board.size - 1 && checkIfEnded() == true) {
                gameOver = true;
                System.out.println(players[turn].getName() + " has won !!!");
                return;
            }
            turn = (turn + 1) % 2;
            printBoard();
        }
    }

    public int getIndex() {
        while(true) {
            // if(onePlayer && turn == 1) return Math.getRandom(0, 8);
            System.out.print("Player " + players[turn].getName() + "'s turn, Give Position: ");
            int pos = scn.nextInt() - 1;
            System.out.println();
            int n = board.size;
            int rn = pos / n, cn = pos % n;
            if(rn < 0 || cn < 0 || rn >= n || cn >= n) {
                System.out.println("Invalid position");
                continue;
            }
            if(board.board[rn][cn] != '-') {
                System.out.println("position already filled");
                continue;
            }
            return pos;
        }
    }

    public boolean checkIfEnded() {

        //ROW WISE TRAVERSAL
        StringBuilder sb = new StringBuilder();
        int n = board.size;
        for(int i = 0; i < n; i ++) {
            sb = new StringBuilder();
            for(int j = 0; j < n; j ++) {
                sb.append(board.board[i][j]);
            }
            String rowString = sb.toString(); 
            if(rowString.equals(zero) || rowString.equals(cross)) {
                return true;
            }
        }

        // COLUMN WISE TRAVERSAL
        for(int i = 0; i < n; i ++) {
            sb = new StringBuilder();
            for(int j = 0; j < n; j ++) {
                sb.append(board.board[j][i]);
            }
            String rowString = sb.toString(); 
            if(rowString.equals(zero) || rowString.equals(cross)) {
                return true;
            }
        }

        // MAJOR DIAGONAL TRAVERSAL
        int i = 0, j = 0;
        sb = new StringBuilder();
        while(i < n) {
            sb.append(board.board[i][j]);
            i ++; j ++;
        }
        String rowString = sb.toString(); 
        if(rowString.equals(zero) || rowString.equals(cross)) {
            return true;
        }

        // MINOR DIAGONAL TRAVERSAL
        i = 0; j = n - 1;
        sb = new StringBuilder();
        while(i < n) {
            sb.append(board.board[i][j]);
            i ++; j --;
        }
        rowString = sb.toString(); 
        if(rowString.equals(zero) || rowString.equals(cross)) {
            return true;
        }

        return false;
    }

}