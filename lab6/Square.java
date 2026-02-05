package lab6;

public class Square extends Rectangle {

    private double side;
    public Square(){
        this.side=0;
    }

    public Square(double side) {
        this.side=this.width;
    }

    @Override
    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    public double getPrimeter() {
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square[Rectangle[Shape="+this.color+"  width="+side+"  length="+side+"]";
    }
}
