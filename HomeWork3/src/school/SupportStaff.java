// Assignment: 3
// Author: Yoav Haviv Vaknin, ID: 208323261
package school;

public abstract class SupportStaff extends Employee{

    /**
     *A constructor that inherits values from Employee class and sent them back to the inheritor
     */
    public SupportStaff (String name, int age, double salary){
        super(name, age, salary);
    }

    /**
     * Abstract function according to the work requirement
     */
    public abstract void support();

    /**
     *A function that checks if two objects are equal by type and fields.
     */
    @Override
    public boolean equals(Object o){
        if(this==o)
            return true;
        if(!(this.getClass()==o.getClass()))
            return false;
        SupportStaff supportStaff = (SupportStaff) o;
        return this.age == supportStaff.age && this.name==supportStaff.name && this.salary==supportStaff.salary;
    }

    /**
     *A function that returns the details of the object
     */
    @Override
    public String toString() {
        return "SupportStaff{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
