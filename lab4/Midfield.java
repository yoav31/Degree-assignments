package lab4;

public class Midfield extends SoccerPlayer {
    private int passesMade ;
    public Midfield(String name, int age){
        super(name,age);
        this.position="midfield";
        this.passesMade= 0;
    }
    public void makePass(){
        passesMade++;
    }

    @Override
    public String play() {
        return super.play()+"  He is controlling the ball!";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
