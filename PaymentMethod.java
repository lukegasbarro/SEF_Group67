public class PaymentMethod {
    public enum PaymentMethodType {
        CREDIT_CARD,
        CASH,
        BANK_TRANSFER,
        PAYPAL,
        OTHER,
    }
    public PaymentMethodType paymentMethodType;
}