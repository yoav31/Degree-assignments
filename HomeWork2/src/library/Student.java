// Assignment: 2
// Author: Yoav Haviv Vaknin, ID: 208323261
package library;

public class Student {
    /**
     * Declaration of the variables.
     */
    private String StudentName;
     final int num;
    private static int count=0;
    private int loanedNum=0;

    /**
     A constructor that accepts the properties of the student and
     * adapts them to the variables of the class.
     */
    public Student(String StudentName){
        this.num=count;
        count++;
        setStudentName(StudentName);
    }

    /**
     *A function that returns the current value of the variable
     */
    public String getStudentName() {
        return StudentName;
    }

    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    /**
     *A function that returns the current value of the variable
     */
    public int getLoanedNum() {
        return loanedNum;
    }

    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public void setLoanedNum(int loanedNum) {
        this.loanedNum = loanedNum;
    }

    /**
     * A function that prints the object as specified in the instructions
     */
    @Override
    public String toString(){
        return "Student number:"+this.num+"     name:"+getStudentName()+
                " loaned-publications:"+getLoanedNum();
    }
}
