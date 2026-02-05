// Assignment: 3
// Author: Yoav Haviv Vaknin, ID: 208323261
package school;

public class Principal extends Administrator{

   /**
   *A constructor that inherits values from Administrator class and sent them back to
   * the inheritor
   */
    public Principal (String name, int age, double salary){
        super(name, age, salary);
    }

    /**
     * A function inherited from an abstract class
     */
    @Override
    public void work() {
        System.out.println("The principal is working .");
    }

    /**
     * A function inherited from an abstract class
     */
    @Override
    public void manage() {
        System.out.println(" The principal is managing the school.");
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
        Principal principal = (Principal) o;
        return this.age == principal.age && this.name==principal.name && this.salary==principal.salary;
    }

    /**
     *A function that returns the details of the object
     */
    @Override
    public String toString() {
        return "Principal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
