package hackerrank;

public class Test {
}

class Shape {
    int length;
    int breadth;
    public Shape(int length,int breadth) {
        this.length=length;
        this.breadth = breadth;
    }
    public void area() {
        System.out.print(length + breadth);

    }
}
class Rectangle extends Shape {
    public Rectangle(int length, int breadth) {
        super(length, breadth);
    }
    @Override
    public void area() {
        System.out.print(length * breadth);
    }

}

