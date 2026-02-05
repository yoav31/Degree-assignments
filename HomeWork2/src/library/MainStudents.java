// Assignment: 2
// Author: Yoav Haviv Vaknin, ID: 208323261
package library;
import java.util.Scanner;
public class MainStudents extends MainPublication2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] students = new Student[100];
        students[0] = new Student("Albert Einstein");
        students[1] = new Student("Marie Curie");
        students[2] = new Student("Rosalind Franklin");
        students[3] = new Student("Stephen Hawking");
        //  listStudents(students);
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null)
                break;
            System.out.println(students[i]);
        }
    }
}


