// Assignment: 3
// Author: Yoav Haviv Vaknin, ID: 208323261
package school;

public abstract class Employee {

    /**
     * Declaration of fields
     */
    protected int age;
    protected String name;
    protected double salary;

    /**
     * A constructor that receives variables
     * from the instance and matches them to fields in the class
     */
    public Employee(String name, int age, double salary){
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    /**
     * A function that returns the current value of the field
     */
    public int getAge() {
        return age;
    }

    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * A function that returns the current value of the field
     */
    public String getName() {
        return name;
    }

    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A function that returns the current value of the field
     */
    public double getSalary() {
        return salary;
    }

    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }


    /**
     * Abstract function according to the work requirement
     */
    public abstract void work();

    /**
     *A function that checks if two objects are equal by type and fields.
     */
    public boolean equals(Object o){
        if(this==o)
            return true;
        if(!(this.getClass()==o.getClass()))
            return false;
        Employee employee = (Employee) o;
        return this.age == employee.age && this.name==employee.name && this.salary==employee.salary;
    }


    /**
     *A function that returns the details of the object
     */
    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
