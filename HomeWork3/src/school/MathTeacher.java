// Assignment: 3
// Author: Yoav Haviv Vaknin, ID: 208323261
package school;

import java.util.Scanner;

public class MathTeacher extends Teacher{


    /**
     *A constructor that inherits values from Teacher class and sent them back to
     * the inheritor plus the name of the profession
     */
    public MathTeacher (String name, int age, double salary){
        super(name,age, salary,"Math");
    }

    /**
     * A function inherited from an abstract class
     */
    @Override
    public void work() {
        System.out.println("The math teacher is working.");
    }

    /**
     * A function inherited from an abstract class
     */
    @Override
    public void teach() {
        System.out.println(" The math teacher is teaching math.");
    }

    /**
     * A function inherited from an abstract class
     * A function creates a mathematical problem and receives
     * an answer from the user and decides whether the answer is correct
     */
    @Override
    public void generateQuestion() {
        Scanner input= new Scanner(System.in);
        int num1=(int)(Math.random()*10);
        int num2=(int)(Math.random()*10);
        int sum=num1*num2;

        System.out.println("What is"+num1+"*"+num2+"?\n" +
                "Please enter your answer :");
        int num3= input.nextInt();

        if(sum==num3)
            System.out.println("Well done your answer is correct");
        else
            System.out.println("Your answer is incorrect. The correct answer is: "+sum);
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
        MathTeacher mathTeacher = (MathTeacher) o;
        return this.age == mathTeacher.age && this.name==mathTeacher.name && this.salary==mathTeacher.salary;
    }

    /**
     *A function that returns the details of the object
     */
    @Override
    public String toString() {
        return "MathTeacher{" +
                "subject='" + subject + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

