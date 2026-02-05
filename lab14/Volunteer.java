package lab14;

public class Volunteer extends StaffMember{
    public Volunteer(Id id){
        super(id);
    }

    @Override
    public double pay() {
        return 0;
    }

    @Override
    public String toString() {
        return "Volunteer{"+super.toString()+"}";
    }
}
