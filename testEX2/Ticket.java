package testEX2;

public class Ticket {
    public Passenger passenger;
    public Ticket(int id, String name){
        this.passenger=new Passenger(id,name);
    }
}
