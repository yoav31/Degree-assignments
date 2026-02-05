// Assignment: 4
// Author: Yoav Haviv Vaknin, ID: 208323261
package employee;

public record LeaveRecord(int ID, int totalLeaves, int leavesTaken) {

    /**
     *A print function that prints according to the job requirement
     */
    @Override
    public String toString() {
        int leftLeaves=this.totalLeaves-this.leavesTaken;
        return "\nLeaveRecord" +
                "\nID= " + ID +
                "\ntotal leaves= " + totalLeaves +
                "\nleaves taken= " + leavesTaken +
                "\n left leaves= " +leftLeaves;
    }
}
