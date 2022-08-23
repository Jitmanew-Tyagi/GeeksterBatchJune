class Parent {

    int x = 0;

    public void invest() {
        System.out.println("Investing in FD");
    }
}


class Child extends Parent{

    @Override
    public void invest() {
        System.out.println("Investing in FD + Stocks");
    }
}

class GrandChild  extends Child{

}

public class InheritenceDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.invest();

        GrandChild gc = new GrandChild();
        gc.invest();
        System.out.println(gc.x);
    }
}