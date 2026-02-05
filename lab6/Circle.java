package lab6;

public class Circle extends Shape{

    protected double radius=1.0;

    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
    }

    public Circle(double radius, String color){
        setRadius(radius);
        setColor(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return 3.14*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public double getPrimeter(){
        return 2*3.14*radius;
    }

    @Override
    public String toString(){
        return "Circle[Shape="+this.color+"  radius="+radius+"]";
    }

}
