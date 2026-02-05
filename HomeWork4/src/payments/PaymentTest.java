package payments;

public class PaymentTest {
    public static void main(String[] args) {

        /**
         * Creating the shows
         */
        Payment payment1 = new Payment(1000.0, PaymentMethod.CASH);
        Payment payment2 = new Payment(1500.0, PaymentMethod.PAYPAL);
        Payment payment3 = new Payment(4500.6, PaymentMethod.CREDIT_CARD);

        /**
         * printing the shows
         */
        payment1.printPaymentDetails();
        payment2.printPaymentDetails();
        payment3.printPaymentDetails();

    }
}