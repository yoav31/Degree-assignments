package lab14;

public class HourlyPayedEmployee extends Employee{

    private double HourCount;
    private double HourRate;
    public HourlyPayedEmployee(Id id,int salary, int SocialNumber){
        super(id, salary, SocialNumber);
        this.HourCount=0;
        this.HourRate=salary/180;
    }

    public void addWorkHours(double HourCount){
        this.HourCount+=HourCount;
    }

    @Override
    public double pay() {
        double payment=HourCount*HourRate;
        this.HourCount=0;
        return payment;
    }

    @Override
    public String toString() {
        return "HourlyPayedEmployee{" +super.toString()+ '}';
    }
}
