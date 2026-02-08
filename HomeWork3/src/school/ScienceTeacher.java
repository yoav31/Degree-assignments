
package school;
import java.util.Scanner;

public class ScienceTeacher extends Teacher{


    /**
     *A constructor that inherits values from Teacher class and sent them back to
     * the inheritor plus the name of the profession
     */
    public ScienceTeacher (String name, int age, double salary){
        super(name, age, salary, "Science");
    }

    /**
     * A function inherited from an abstract class
     */
    @Override
    public void work() {
        System.out.println("The science teacher is working.");
    }

    /**
     * A function inherited from an abstract class
     */
    @Override
    public void teach() {
        System.out.println("The science teacher is teaching science.");
    }

    /**
     * A function inherited from an abstract class
     * A function creates a mathematical problem and receives
     * an answer from the user and decides whether the answer is correct
     */
    @Override
    public void generateQuestion() {
        Scanner input= new Scanner(System.in);
        double mass=Math.random()*100;
        double acceleration=Math.random()*10;
        double force=mass*acceleration;

        System.out.println("A "+mass+"  gram object is accelerating at "+acceleration+ "  m/s^2.\n" +
                "What is the resulting force in Newtons?\n Please enter your answer :");

        double MyAnsswer=input.nextDouble();

        if(force==MyAnsswer){
            System.out.println("Well done your answer is correct");
        }
        else{
            System.out.println("Your answer is incorrect. The correct answer is: "+force);
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
        ScienceTeacher scienceTeacher = (ScienceTeacher) o;
        return this.age == scienceTeacher.age && this.name==scienceTeacher.name && this.salary==scienceTeacher.salary;
    }

    /**
     *A function that returns the details of the object
     */
    @Override
    public String toString() {
        return "ScienceTeacher{" +
                "subject='" + subject + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

