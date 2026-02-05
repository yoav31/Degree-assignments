package lab4;

import java.util.Objects;

public class SoccerPlayer {
    private String name;
    private int age;
    protected static int counter=0;
    private final int NumberPlayer=counter;
    protected String position;

    public SoccerPlayer( String name,int age){
        setName(name);
        setAge(age);
        setPosition("general player");
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberplayer() {
        return NumberPlayer;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public String play(){
        return getName()+" is a "+getPosition()+" player.";
    }
    @Override
    public String toString(){
        return "Player-number:"+this.NumberPlayer+"    position:"+position+"   age:"+age+"  name:"+name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SoccerPlayer that = (SoccerPlayer) o;
        return age == that.age && NumberPlayer == that.NumberPlayer && Objects.equals(name, that.name) && Objects.equals(position, that.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, NumberPlayer, position);
    }
}
