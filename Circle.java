package Week13;

public class Circle extends Shape {
    double Radius;
    public Circle(double Radius){
        this.Radius = Radius;
    }
    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return Radius*Math.PI;
    }
}
