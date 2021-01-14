package Work;

public class MainApplication2 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(0.0 , 0.0 , 2);
        Circle.checkIntersect check = circle1.new checkIntersect();
        System.out.println("Area of cir1 = " +circle1.findArea());
        System.out.println("Circumferrence of cir1 = " +circle1.findCircumfenrence());

        Circle circle2 = new Circle(1.0 , 2.0 , 3);
        System.out.println("Area of cir2 = " +circle2.findArea());
        System.out.println("Circumferrence of cir2 = " +circle2.findCircumfenrence());

        Circle circle3 = new Circle(3.0 , 5.0 , 1);
        System.out.println("Area of cir3 = " +circle3.findArea());
        System.out.println("Circumferrence of cir3 = " +circle3.findCircumfenrence());

        Circle circle4 = new Circle(-1.0 , -1.0 , 0);
        System.out.println("Area of cir4 = " +circle4.findArea());
        System.out.println("Circumferrence of cir4 = " +circle4.findCircumfenrence());

        System.out.println("Is circle 1 intersec circle 2: " + check.checkIntersect(circle1.getX(),circle2.getX(),circle1.getY(),circle2.getY(),circle1.getR(),circle2.getR()) );
        System.out.println("Is circle 1 intersec circle 3: " + check.checkIntersect(circle1.getX(),circle3.getX(),circle1.getY(),circle3.getY(),circle1.getR(),circle3.getR()) );


    }
    //Thananthon Koonyo 632115023
    

 
    
}
