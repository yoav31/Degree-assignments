// Assignment: 3
// Author: Yoav Haviv Vaknin, ID: 208323261
package school;

public abstract class Teacher extends Employee{

    /**
     * Declaration of field
     */
    final String subject;


    /**
     *A constructor that inherits values from Employee class and sent them back to the inheritor
     * with the name of the subject
     */
    public Teacher(String name, int age, double salary, String subject){
        super(name, age, salary);
        this.subject=subject;

    }


    /**
     * Abstract function according to the work requirement
     */
    public abstract void teach();

    /**
     * Abstract function according to the work requirement
     */
    public abstract void generateQuestion();

    /**
     *A function that checks if two objects are equal by type and fields.
     */
    @Override
    public boolean equals(Object o){
        if(this==o)
            return true;
        if(!(this.getClass()==o.getClass()))
            return false;
        Teacher teacher = (Teacher) o;
        return this.age == teacher.age && this.name==teacher.name && this.salary==teacher.salary;
    }

    /**
     *A function that returns the details of the object
     */
    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
