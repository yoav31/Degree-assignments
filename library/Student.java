package library;
/**
 * Assignment:2
 * @author Maor Pinhas id:324170885
 *
 */

public class Student {
    String studentName;
    final int studentNumber=number;
    static int number=0;
    int loanedNum;
    publication [] arr=new publication [3];

    /**
     * creating a new student object with given parameters
     * @param studentName-presents the student's name
     */
    public Student(String studentName) {
        setStudentName(studentName);
        number++;
    }
    /**
     * the method checks and sets the given studentName to the constructor due to the value
     * @param studentName-presents the student's name that given to the constructor
     */
    public void setStudentName(String studentName) {
        if(studentName.length()>0) {
            this.studentName=studentName;
        }
        else {
            this.studentName="unknown";
        }
    }

    /**
     * override method that prints the student details and the details of his loaned publications
     */
    @Override
    public String toString() {
        String s="";
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==null) {
                break;
            }
            s=s+arr[i].toString()+"\r\n";
        }
        return "student number: "+this.studentNumber+"       name: "+this.studentName+
                " loaned-publications:"+this.loanedNum+"\r\n"+
                "List of loaned publications: "+"\r\n"+s;

    }

}

