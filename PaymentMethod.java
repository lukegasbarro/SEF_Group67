/* This Class is called PaymentMethod, and is used to create
 * a payment method object. The payment method object will be
 * used to store the payment method type, which will be used
 * to process the refund request. The payment method type is
 * stored as an enum, which can easily be modified to add more
 * payment method types in the future. 
 */

public class PaymentMethod {

    //The payment method type is stored as an enum.
    public enum PaymentMethodType {
        CREDIT_CARD,
        CASH,
        BANK_TRANSFER,
        PAYPAL,
        OTHER,
    }

    public PaymentMethodType paymentMethodType;
}