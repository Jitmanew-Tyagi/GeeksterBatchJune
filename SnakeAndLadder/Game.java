import java.util.*;
public class Game {
    Board board;
    Player[] players;
    boolean[] isAllowed;
    int turn;
    Coordinates[] places;
    Game(Board board, Player[] players) {
        this.board = board;
        this.players = players;
        isAllowed = new boolean[players.length];
        turn = 0;
        places = new Coordinates[players.length];
        for(int i = 0; i < players.length; i ++) places[i] = new Coordinates(board.size - 1, 0);
    }

    public void play() {
        while(true) {
            int num = Die.roll();
            // System.out.println(players[turn].name + " rolled -> " + num);
            System.out.println(players[turn].name + " rolled -> " + num + places[turn]);
            if(!isAllowed[turn]) {
                if(num != 1) {
                    turn = (turn + 1) % players.length;
                    continue;
                }
                else isAllowed[turn] = true;
            }
            // int rn = places[turn].rn, cn = places[turn].cn;
            Coordinates newCordinates = getNewCordinates(places[turn], num);
            //100
            if(newCordinates.rn < 0) {
                System.out.println(players[turn].name + " has won;");
                return;
            }
            places[turn] = newCordinates;
            turn = (turn + 1) % players.length;
        }
    }

    public boolean checkIfJumperExists(int rn, int cn) {
        // System.out.println(players[turn].name + " " + rn + " " + cn);
        return board.jumpers.containsKey(board.board[rn][cn]);
    }

    public Coordinates getNewCordinates(Coordinates old, int numofMoves) {
        int rn = old.rn, cn = old.cn;
        while(numofMoves --> 0) {
            if(board.size % 2 == 0) {
                if(rn % 2 != 0) {
                    if(cn == board.size - 1) rn --;
                    else cn ++;
                }
                else {
                    if(cn == 0) rn --;
                    else cn --;
                }
            } else {
                if(rn % 2 != 0) {
                    if(cn == board.size - 1) rn --;
                    else cn ++;
                }
                else {
                    if(cn == 0) rn --;
                    else cn --;
                }
            }
        }
        if(rn < 0) return new Coordinates(rn, cn);
        if(checkIfJumperExists(rn, cn)) {
            
            Jumper jumperCordinates = board.jumpers.get(board.board[rn][cn]);
            return jumperCordinates.end; 
        }
        return new Coordinates(rn, cn);
    }
}