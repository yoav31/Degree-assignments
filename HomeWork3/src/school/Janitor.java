
package school;

public class Janitor extends SupportStaff{

    /**
     *A constructor that inherits values from SupportStaff class and sent them back to the inheritor
     */
    public Janitor (String name, int age, double salary){
        super(name,age,salary);
    }

    /**
     * A function inherited from an abstract class
     */
    @Override
    public void work() {
        System.out.println("The janitor is working.");
    }

    /**
     * A function inherited from an abstract class
     */
    @Override
    public void support() {
        System.out.println("The janitor is ordering the following items:");
        for(int i=1; i<=10; i++){
            System.out.println("Item #"+i+"     "+"amount:"+(int)(Math.random()*10));
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
        Janitor janitor = (Janitor) o;
        return this.age == janitor.age && this.name==janitor.name && this.salary==janitor.salary;
    }

    /**
     *A function that returns the details of the object
     */
    @Override
    public String toString() {
        return "Janitor{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

