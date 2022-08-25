abstract class Shape {

    Shape () {
        System.out.println("Shape constructor");
    }



    abstract int area();
    abstract int perimeter();
    
}

class Rectangle extends Shape {
    int l, b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    @Override
    public int area() {
        return l * b;
    }

    @Override
    public int perimeter() {
        return 2 * (l + b);
    }
}

class Circle extends Shape {
    int r;

    Circle(int r) {
        this.r = r;
    }

    @Override
    public int area() {
        return 3 * r * r;
    }

    @Override
    public int perimeter() {
        return 2 * 3 * r;
    }
} 

public class AbstractDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println(circle.area());
    }
}



