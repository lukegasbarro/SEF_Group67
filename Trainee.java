public class Trainee {
    public String name;
    public int studentNumber;
    public boolean isRegistered;
    public int paidAmount;
    public boolean refundStatus;
    
    public boolean paymentMethodActive;
    public boolean twentyFourhoursBeforeFirstSession;


    public Trainee(String name, int studentNumber, boolean isRegistered, int paidAmount, boolean refundStatus, boolean paymentMethodActive, boolean twentyFourhoursBeforeFirstSession) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.isRegistered = isRegistered;
        this.paidAmount = paidAmount;
        this.refundStatus = refundStatus;
        
        this.paymentMethodActive = paymentMethodActive;
        this.twentyFourhoursBeforeFirstSession = twentyFourhoursBeforeFirstSession;
    }

    PaymentMethod paymentMethod = new PaymentMethod();
    
     

    public String getName() {
        return name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public int getPaidAmount() {
        return paidAmount;
    }

    public boolean isRefundStatus() {
        return refundStatus;
    }


    public boolean isPaymentMethodActive() {
        return paymentMethodActive;
    }

    public boolean isTwentyFourhoursBeforeFirstSession() {
        return twentyFourhoursBeforeFirstSession;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }

    public void setPaidAmount(int paidAmount) {
        this.paidAmount = paidAmount;
    }

    public void setRefundStatus(boolean refundStatus) {
        this.refundStatus = refundStatus;
    }


    public void setPaymentMethodActive(boolean paymentMethodActive) {
        this.paymentMethodActive = paymentMethodActive;
    }

    public void setTwentyFourhoursBeforeFirstSession(boolean twentyFourhoursBeforeFirstSession) {
        this.twentyFourhoursBeforeFirstSession = twentyFourhoursBeforeFirstSession;
    }

    //Diagram Functions
    public void cancelTraining() 
    {
        if (isRegistered && !refundStatus && paymentMethodActive && twentyFourhoursBeforeFirstSession) 
        {
            refundStatus = true;
            isRegistered = false;

            if (refundStatus = true)
            {
            System.out.println("You have been removed from the training and your refund is being processed to your " + paymentMethod);
            }
            else 
            {
                System.out.println("Refund has been denied. Please Contact Training Provider for more information.");
            }
        }
    }
    
    public void printTraineeDetails() 
    {
        System.out.println("Trainee Name: " + name);
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Registered: " + isRegistered);
        System.out.println("Paid Amount: " + paidAmount);
        System.out.println("Refund Status: " + refundStatus);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Payment Method Active: " + paymentMethodActive);
        System.out.println("24 Hours Before First Session: " + twentyFourhoursBeforeFirstSession);
    }
}

