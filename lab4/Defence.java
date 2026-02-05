package lab4;

import java.util.Objects;

public class Defence extends SoccerPlayer {
    private int tackleMade;

    public Defence(String name, int age) {
        super(name, age);
        this.position = "defence";
        this.tackleMade = 0;
    }

    public void makeTackle() {
        tackleMade++;
    }

    @Override
    public String play() {
        return super.play() + " He is blocking shots!";
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Defence defence = (Defence) o;
        return tackleMade == defence.tackleMade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tackleMade);
    }
}
