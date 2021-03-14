package Week13;

public class Main {
    public static void main(String[] args) {
        Shape square  = new Square(4);
        Shape circle = new Circle(3);
        Shape triangle = new Triangle(4, 4);
        System.out.println(square.getArea());
        System.out.println(circle.getArea());
        System.out.println(triangle.getArea());
    }
    
}
