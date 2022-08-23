abstract class Flipkart {
    void shipping() {
        System.out.println("Shipped");
    }

    abstract void pricing();
    abstract void packaging();
}

class Seller extends Flipkart {
    public void pricing() {
        System.out.println("pricing"); 
    }

    public void packaging() {
        System.out.println("packaging");
    }
}

public class FlipkartDemo {
    public static void main(String[] args) {
        Seller manavJi = new Seller();
        manavJi.pricing();
        manavJi.shipping();
    }
}