class Rectangle {
    int length;
    int bredth;
    int x = 5;
    public Rectangle () {
    
    }

    public Rectangle (int length, int bredth) {
        this.length = length;
        this.bredth = bredth;
    }

    public int area() {
        return this.length * this.bredth;
    }
}

class Cuboid extends Rectangle {
   int height;
    int x = 10;
   public Cuboid () { // Non paramet... constructor

   }

   public Cuboid (int length, int bredth, int height) {
       super(length, bredth);
       this.height = height;
        System.out.println(super.x);
   }

    @Override
   public int area() {
    return super.area() * this.height;
   }
}

public class CuboidDemo {
    public static void main(String[] args) {
        Cuboid x = new Cuboid(5, 4, 6);
        System.out.println(x.area());
    }
}