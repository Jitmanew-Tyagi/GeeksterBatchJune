class Parent {
     Parent (int x) {
     public   System.out.println("Parent constructer" + x);
    }

    public Parent () {
        System.out.println("Parent constructer : Non param");
    }   

}

class Child extends Parent {
    public Child () {
        System.out.println("Child constructer : Non Param");
    } 

    public Child (int x) {
        super(5);
        System.out.println("Child constructer " + x);
    }
}

public class InheritenceDemo {
    public static void main(String[] args) {
        Child child = new Child();
    }
}