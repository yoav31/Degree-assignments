
package school;

import java.util.Scanner;

public class EnglishTeacher extends Teacher {


    /**
     *A constructor that inherits values from Teacher class and sent them back to
     * the inheritor plus the name of the profession
     */
    public EnglishTeacher (String name, int age, double salary){
        super(name,age,salary,"English");
    }

    /**
     * A function inherited from an abstract class
     */
    @Override
    public void work() {
        System.out.println("The english teacher is working.");
    }

    /**
     * A function inherited from an abstract class
     */
    @Override
    public void teach() {
        System.out.println("The english teacher is teaching english.");
    }


    /**
     * A function inherited from an abstract class
     * The method creates a question by randomly choosing a word
     * from a list and receives an answer from the user
     */
    @Override
    public void generateQuestion() {
        Scanner input= new Scanner(System.in);
        String WordArray[]={"cat", "dog", "tree", "book", "cup", "sun", "moon", "star", "car", "house"};
        String QuestArray[]={"Spell", "Define", "Use in a sentence", "Rhyme with", "Antonym of", "Synonym of"};

        int indexWord= (int) (Math.random() * 10);
        int indexQuest= (int) (Math.random() * 10);
        System.out.println(QuestArray[indexQuest]+" the word "+"'"+WordArray[indexWord]+"'\n" +
                "Please enter your answer :");
        String str= input.next();
        System.out.println("Your answer is: "+str);

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
       EnglishTeacher englishTeacher = (EnglishTeacher) o;
        return this.age == englishTeacher.age && this.name==englishTeacher.name && this.salary==englishTeacher.salary;
    }

    /**
     *A function that returns the details of the object
     */
    @Override
    public String toString() {
        return "EnglishTeacher{" +
                "subject='" + subject + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

