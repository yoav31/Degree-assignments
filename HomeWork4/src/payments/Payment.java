// Assignment: 4
// Author: Yoav Haviv Vaknin, ID: 208323261
package payments;
public class Payment {

    /**
     * Declaration of the fields
     */
    private double amount;
    private PaymentMethod method;
    private String referenceNumber;

    /**
     *A constructor that receive the instance variables and matches them to the fields
     */
    public Payment(double amount, PaymentMethod method){
        this.amount=amount;
        this.method=method;
        referenceNumber="REF-"+(int)(Math.random()*1000000);

    }


    /**
     *A print function that prints according to the job requirement
     */
    public void printPaymentDetails() {
         System.out.println("Payment{" +
                "amount=" + amount +
                ", method=" + method +
                ", eferenceNumber='" + referenceNumber + '\'' +
                '}');
    }
}
