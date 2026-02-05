package lab4;

public class Reserve extends SoccerPlayer {
    public Reserve(String name, int age) {
        super(name, age);
        this.position = "Reserve";
    }

    @Override
    public String play() {
        return super.play()+"  He is ready to substitute!";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
