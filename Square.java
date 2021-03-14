package Week13;

public class  Square extends Shape{
    double side;
    public Square(double side){
        this.side = side;

    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return side*side;
    }
    
}
