class Parent {
    int x = 5;
    public Parent (int x) {
        System.out.println("Parent constructer " + x);
    }

    public Parent () {
        System.out.println("Parent constructer : Non param");
    }   

}

class Child extends Parent {
    public Child () {
        System.out.println("Child constructer : Non Param");
        // System.out.println();
    } 

    public Child (int x) {
        super(7);
        System.out.println("Child constructer " + x);
    }
}

class GrandChild extends Child {
    // int x = 9;
    public GrandChild () {
        System.out.println("GrandChild constructer : Non Param");
        System.out.println(super.x);
    } 

    public GrandChild (int y) {
        // super(5);
        this.x = y;
        System.out.println("GrandChild constructer " + x);
        this.display()
    }
}

public class InheritenceDemo {
    public static void main(String[] args) {
        GrandChild gc = new GrandChild(5);

    }
}