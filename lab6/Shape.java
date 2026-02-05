package lab6;

public abstract class Shape {
    protected String color="red";

    public Shape(){
    }
    public Shape(String Shape){
        setColor(Shape);
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString(){
        return "Shape[color="+this.color+"]";
    }
}
