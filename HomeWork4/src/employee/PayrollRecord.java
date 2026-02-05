// Assignment: 4
// Author: Yoav Haviv Vaknin, ID: 208323261
package employee;

public record PayrollRecord(int ID ,double salary, double bonus, double tax) {

    /**
     *A print function that prints according to the job requirement
     */
    @Override
    public String toString() {
        double totalSalary=this.salary+this.bonus-this.tax;
        return "\nPayrollRecord" +
                "\nID=" + ID +
                "\nsalary=" + salary +
                "\nbonus=" + bonus +
                "\ntax=" + tax +
                "\ntotal salary="+totalSalary;
    }
}
