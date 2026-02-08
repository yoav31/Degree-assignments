
package school;

public abstract class Administrator extends Employee {

    /**
     *A constructor that inherits values from Employee class and sent them back to the inheritor
     */
    public Administrator(String name, int age, double salary) {
        super(name, age, salary);
    }


    /**
     * Abstract function according to the work requirement
     */
    public abstract void manage();

    /**
     *A function that checks if two objects are equal by type and fields.
     */
    public boolean equals(Object o){
        if(this==o)
            return true;
        if(!(this.getClass()==o.getClass()))
            return false;
        Administrator administrator = (Administrator) o;
        return this.age == administrator.age && this.name==administrator.name && this.salary==administrator.salary;
    }


    /**
     *A function that returns the details of the object
     */
    @Override
    public String toString() {
        return "Administrator{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}
