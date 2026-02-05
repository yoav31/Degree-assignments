package library;

/**
 * Assignment:2
 * @author Maor Pinhas id:324170885
 *
 */
public class MainStudents {
    /**
     * creating a list of students and printing their details
     * @param args/
     */
    public static void main(String[] args) {
        Student[] students = new Student[100];
        students[0]=new Student("Albert Einstein");
        students[1]= new Student("Marie Curie");
        students[2]= new Student("Rosalind Franklin");
        students[3]= new Student("Stephen Hawking");
        listStudents(students);

    }
    /**
     * the method prints a list of student's details
     * @param students-a student's array
     */

    public static void listStudents(Student[] students) {
        for(int i=0; i<Student.number;i++) {
            System.out.println("student number: "+students[i].studentNumber+"       name: "+students[i].studentName+
                    " loaned-publications:"+students[i].loanedNum);
        }
    }
}

