// Assignment: 4
// Author: Yoav Haviv Vaknin, ID: 208323261
package employee;

public class EmployeeManagementSystem {
    public static void main(String[] args){
        /**
         * Creating the show
         */
        AttendanceRecord attendanceRecord1=new AttendanceRecord(208745624, 21,14);
        AttendanceRecord attendanceRecord2=new AttendanceRecord(308774626, 25,18);
        EmployeeRecord employeeRecord1=new EmployeeRecord(453267965,"Yosi Bitton","engineering","management");
        EmployeeRecord employeeRecord2=new EmployeeRecord(854769123,"Rami Cohen","mechanic","storekeeper");
        LeaveRecord leaveRecord1=new LeaveRecord(123296857,30,12);
        LeaveRecord leaveRecord2=new LeaveRecord(745812365,25,13);

        System.out.println(attendanceRecord1);
        System.out.println(attendanceRecord2);
        System.out.println(employeeRecord1);
        System.out.println(employeeRecord2);
        System.out.println(leaveRecord1);
        System.out.println(leaveRecord2);

    }
}
