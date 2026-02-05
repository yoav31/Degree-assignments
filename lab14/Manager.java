package lab14;

import java.util.Objects;

public class Manager extends Employee{
    private int bonus;
    public Manager( Id id,int salary, int SocialNumber){
        super(id ,salary,SocialNumber);
        this.bonus=0;
    }
    public void addBonus(int bonus){
        this.bonus+=bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +" id"+super.getId()+
                " salary"+super.getSalary()+" insurance"+super.getSocialNumber()+
                "bonus=" + bonus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return bonus == manager.bonus && this.getId()==manager.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bonus);
    }
}
