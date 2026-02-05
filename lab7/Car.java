package lab7;

public class Car implements Moveable{

    private int position=0;
    public Car(){
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    @Override
    public String toString(){
        return"The car is in position: "+position;
    }

    @Override
    public boolean equals(Object o){
        if(this==o)
            return true;
        if(!(o instanceof Car))
            return false;
          Car another=(Car)o;
         return this.position==another.getPosition();

    }

    public void moveLeft(){
        setPosition(getPosition()-1);
    }
    public void moveRight(){
        setPosition(getPosition()+1);
    }


}
