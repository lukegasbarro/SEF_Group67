/* This class is called Trainee, and is used to create a trainee object.
 * The trainee object will be used to store the trainee information, 
 * registration status, and payment information.
 * The methods below explain these processes.
 */

public class Trainee {

    //Trainee information.


    public String name;                                 //Trainee name.
    public int studentNumber;                           //Trainee student number.
    public boolean isRegistered;                        //Trainee registration status.
    public int paidAmount;                              //Amount paid by the trainee.
    public boolean refundStatus;                        //Has the trainee been refunded?
    
    public boolean paymentMethodActive;                 //Is the trainee's payment method active?
    public boolean twentyFourhoursBeforeFirstSession;   //Is it 24 hours before the first session?


    //Constructor - Used to create a trainee object. Takes in the trainee information as parameters.
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
    
     
    //Getters and Setters. Note: These are yet used in the demonstration for the scenarios, however they are included for future use.
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

    //Diagram Functions - These functions are used to demonstrate the scenarios in the diagrams.

    //The trainee cancel's their training course.
    public void cancelTraining() 
    {
        //If the trainee is registered, and the refund status is false, and the payment method is active, 
        //and it is 24 hours before the first session, then the trainee can cancel their training.
        if (isRegistered && !refundStatus && paymentMethodActive && twentyFourhoursBeforeFirstSession) 
        {
            refundStatus = true;
            isRegistered = false;

            if (refundStatus = true)
            {   
                //Message:
                System.out.println("You have been removed from the training and your refund is being processed to your " + paymentMethod);
            }
            else 
            {
                //Message:
                System.out.println("Refund has been denied. Please Contact Training Provider for more information.");
            }
        }
    }

    //The student completes the feedback poll, and when they press the submit button, it automatically
    //is stored by the system.
    public FeedbackPoll completePoll(FeedbackPoll feedbackPoll) 
    {
        return feedbackPoll;
    }


    

}

