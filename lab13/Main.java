package lab13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GradeTracker tracker = new GradeTracker();
        Scanner scanner=new Scanner(System.in);
        double temp=0;
        System.out.println("enter a grade");
        temp = scanner.nextDouble();
        while (temp !=-1) {
            tracker.addGrade(temp);
            System.out.println("enter a grade");
            temp = scanner.nextDouble();
        }
        System.out.println(tracker.getHighestGrade());
        System.out.println(tracker.getLowestGrade());
        System.out.println(tracker.getAverage());

    }
}
