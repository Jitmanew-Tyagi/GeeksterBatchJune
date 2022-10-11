public class Main {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.setName("A");
        p1.setSymbol('X');

        Player p2 = new Player();
        p2.setName("B");
        p2.setSymbol('O');

        Board board = new Board(3);
        Game game = new Game(new Player[] {p1, p2}, board);
        game.play();
    }
}