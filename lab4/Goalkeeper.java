package lab4;

public class Goalkeeper extends SoccerPlayer{
    private int savesMade;
    public Goalkeeper(String name, int age){
        super(name,age);
        this.savesMade=0;
        this.position="goalkeeper";
    }
    public void makeSave(){
        savesMade++;
    }

    @Override
    public String play() {
        return super.play()+" He is stopping shots!";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
