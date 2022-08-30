public class Car {
    protected int average;
    public String colour;
    public int power;
    public int torque;
    public static int cost = 100000;
    public int[] dim;

    public void run(int speed) {
        System.out.println("up and running at" + speed);
    }

    public void showInfo() {
        
        System.out.println("Average: " + this.average);
        System.out.println("Power: " + this.power);
    }

    public void blowHorn() {
        System.out.println("beeeep");
    }

    public static int getCost() {
        System.out.println(cost);
        return cost;
    }
}