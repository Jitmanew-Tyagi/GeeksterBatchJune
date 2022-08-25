abstract class Flipkart {

    public Flipkart (int x) {

    }

    void shipping() {
        System.out.println("Shipped");
    }

    abstract void pricing();
    abstract void packaging();
}

class Seller extends Flipkart {
    public Seller(int x) {
        super(x);
    }

    @Override
    public void shipping() {
        super.shipping();
        // System.out.println("Shipped child");

    }

    public void pricing() {
        System.out.println("pricing"); 
    }

    public void packaging() {
        System.out.println("packaging");
    }
}

public class FlipkartDemo {
    public static void main(String[] args) {
        Seller manavJi = new Seller(5);
        manavJi.pricing();
        manavJi.shipping();
    }
}