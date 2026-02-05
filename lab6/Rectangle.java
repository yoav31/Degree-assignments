package lab6;

public abstract class Rectangle extends Shape{

    protected double width=1.0;
    protected double length=1.0;

    public Rectangle(){}
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length, String color){
        this.width=width;
        this.length=length;
        this.color=color;
    }

    @Override
    public String getColor() {
        return this.color;
    }
    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public abstract double getSide();


    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*width+2*length;
    }

    @Override
    public String toString() {
         return "Rectangle[Shape="+this.color+"  width="+width+"  length="+length+"]";
    }
}
