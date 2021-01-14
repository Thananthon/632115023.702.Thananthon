package Work;

public class Circle {
    
    private double x;
    private double y;
    private double radius;
    private double Area;
    private double Circumfenrence;
    

    public Circle(double x, double y){
        this.x = x;
        this.y = y;
        this.radius = 1;
    }
    public Circle(double x , double y , double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public double findArea(){
        Area = Math.PI*Math.pow(radius, 2);
        return Area;
    }
    public double findCircumfenrence(){
        Circumfenrence = 2 * Math.PI * radius;
        return Circumfenrence;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double getR(){
        return this.radius;
    }

    class checkIntersect{
        public boolean checkIntersect (double x1, double x2, double y1, double y2, double r1, double r2){
            double d = Math.sqrt(Math.pow((x1-x2), 2) + (Math.pow((y1-y2), 2)));
            boolean a = false;
            return a = d < (r1 + r2) ? true : false;
        }
    }//Thananthon Koonyo 632115023

    
}
