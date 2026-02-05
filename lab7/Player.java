package lab7;

import java.util.Objects;

public class Player implements Moveable{
    private int position=0;
    private final String name;

    public Player(String name){
        this.name=name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "The player" +getName()+" n is in position: "+getPosition();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return position == player.position && Objects.equals(name, player.name);
    }
    public void moveLeft(){
        setPosition(getPosition()-1);
    }
    public void moveRight(){
        setPosition(getPosition()+1);
    }
}
