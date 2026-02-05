// Assignment: 4
// Author: Yoav Haviv Vaknin, ID: 208323261
package employee;

public record EmployeeRecord(int ID,String name,String department,String designation) {

    /**
     *A print function that prints according to the job requirement
     */
    @Override
    public String toString() {
        return "\nEmployeeRecord" +
                "\nID=" + ID +
                "\nname=" + name +
                "\ndepartment=" + department +
                "\ndesignation=" + designation ;
    }
}
