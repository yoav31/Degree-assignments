// Assignment: 3
// Author: Yoav Haviv Vaknin, ID: 208323261
package school;

public class Secretary extends SupportStaff{

    /**
     *A constructor that inherits values from SupportStaff class and sent them back to the inheritor
     */
    public Secretary (String name, int age, double salary){
        super(name, age, salary);
    }

    /**
     * A function inherited from an abstract class
     */
    @Override
    public void work() {
        System.out.println("The secretary is working.");
    }

    /**
     * A function inherited from an abstract class
     * the function print the grades of 30 students
     */
    @Override
    public void support() {
        System.out.println("The secretary enters the following grades into moodle:");
        for (int i=1; i<=30; i++){
            System.out.println("Student #"+i+"     grade:"+(int)(Math.random()*100));
        }
    }

    /**
     *A function that checks if two objects are equal by type and fields.
     */
    @Override
    public boolean equals(Object o){
        if(this==o)
            return true;
        if(!(this.getClass()==o.getClass()))
            return false;
        Secretary secretary = (Secretary) o;
        return this.age == secretary.age && this.name==secretary.name && this.salary==secretary.salary;
    }

    /**
     *A function that returns the details of the object
     */
    @Override
    public String toString() {
        return "Secretary{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
