package lab14;

import java.util.Objects;

public class Employee extends StaffMember  {

    private int salary;
    private int SocialNumber;
    public Employee(Id id,int salary, int SocialNumber) {
        super(id);
        this.salary=salary;
        this.SocialNumber=SocialNumber;
    }

    @Override
    public double pay() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id"+super.getId()+
                "salary=" + salary +
                ", SocialNumber=" + SocialNumber +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public int getSocialNumber() {
        return SocialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && SocialNumber == employee.SocialNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, SocialNumber);
    }
}
