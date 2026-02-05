package lab4;

public class Forward extends SoccerPlayer {
    private int goalsMade;

    public Forward(String name, int age) {
        super(name, age);
        this.position = "Forward";
        this.goalsMade = 0;
    }

    public void makeGoals() {
        goalsMade++;
    }

    @Override
    public String play() {
        return super.play() + " He is scoring goals!";
    }

    @Override
    public String toString() {
        return super.toString() + "  number of goals:" + goalsMade;
    }
}
