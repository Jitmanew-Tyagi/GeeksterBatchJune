public class Jumper {
    Coordinates start;
    Coordinates end;
    String name;

    public Jumper(Coordinates start, Coordinates end) {
        this.start = start;
        this.end = end;

        if(start.rn > end.rn) this.name = "ladder";
        else this.name = "snake";
    }
}