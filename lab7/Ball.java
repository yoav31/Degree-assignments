package lab7;

import java.util.Objects;

public class Ball implements Moveable{

    private int x=0;
    private int y=0;
    private int speed=0;

    public Ball(int x, int y, int speed) {
        this.x = x;
        this.y = y;
        this.speed=speed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSpeed() {
        return speed;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void moveUp(){
        y-=speed;
    }
    public void moveDown(){
        y+=speed;
    }
    public void moveLeft(){
        x-=speed;
    }
    public void moveRight(){
        x+=speed;
    }
    public Point getPosition(){
        Point point=new Point(x,y);
        return point;
    }
    @Override
    public String toString(){
        return "The ball is in position:"+getPosition() +" and his speed is: "+speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return x == ball.x && y == ball.y && speed == ball.speed;
    }

}
