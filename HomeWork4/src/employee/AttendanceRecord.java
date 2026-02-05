// Assignment: 4
// Author: Yoav Haviv Vaknin, ID: 208323261
package employee;

public record AttendanceRecord(int ID,int totalWorkingDays, int daysPresent) {


    /**
     *A print function that prints according to the job requirement
     */
    @Override
    public String toString() {
        int percent= (this.daysPresent/this.totalWorkingDays)*100;
        return "\nAttendanceRecord" +
                "\nID=" + ID +
                "\ntotal working days=" + totalWorkingDays +
                "\ndays present=" + daysPresent +
                "\nAttendance percentages="+percent;
    }
}
