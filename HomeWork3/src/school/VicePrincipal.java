
package school;
public class VicePrincipal extends Administrator{

    /**
     *A constructor that inherits values from Administrator class and sent them back to the inheritor
     */
    public VicePrincipal (String name, int age, double salary){
        super(name, age, salary);
    }

    /**
     * Abstract function according to the work requirement
     */
    @Override
    public void work() {
        System.out.println("The vice principal is working");
    }

    /**
     * Abstract function according to the work requirement
     */
    @Override
    public void manage() {
        System.out.println("The vice principal is assisting the principal");
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
        VicePrincipal vicePrincipal = (VicePrincipal) o;
        return this.age == vicePrincipal.age && this.name==vicePrincipal.name && this.salary==vicePrincipal.salary;
    }

    /**
     *A function that returns the details of the object
     */
    @Override
    public String toString() {
        return "VicePrincipal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

