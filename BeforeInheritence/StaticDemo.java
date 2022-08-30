class Example {
    int x = 0;
    static int y = 1;
}


public class StaticDemo {
    public static void main(String[] args) {
        Example e1 = new Example();
        Example e2 = new Example();
        System.out.println("E1 " + e1.x + " " + e1.y); // 0 1
        System.out.println("E2 " + e2.x + " " + e2.y); // 0 1
        e1.x ++;
        e1.y ++;
        System.out.println("E1 " + e1.x + " " + e1.y); // 1 2
        System.out.println("E2 " + e2.x + " " + e2.y); // 0 2
    }
}