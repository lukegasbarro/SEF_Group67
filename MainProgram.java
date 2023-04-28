public class MainProgram {
  public static void main(String[] args) {
    //Instanciate a Trainee object.
    //Payment Method object is instanciated within the Trainee class.
    Trainee trainee = new Trainee("John", 123456, true, 100, false, true, true);

    //Instanciate a Finance Manager Object.
    FinanceManager financeManager = new FinanceManager();

    //Instanciate a Training Course Object.
    TrainingCourse trainingCourse = new TrainingCourse();

    //Instanciate System. The system refers to Melbourne Professional Training Services website and backend servers.
    //The system performs the depositAmount(), makePositionAvailable(), and changeStatusToUnregistered() functions automatically.
    TheSystem system = new TheSystem();

    //If the trainee is registered in the system, that means they are enrolled and paid up for the course.
    if (trainee.isRegistered()) {
      
      //The trainee cancels the training.
      trainee.cancelTraining();

      //If the trainee cancels more than 24 hours before the first training session, the refund will be approved. 
      if(trainee.twentyFourhoursBeforeFirstSession == true) {
        
        //finance manager approves the refund. When approved, the system is automatically notified.
        financeManager.approveRefund();
        
        //The system automatically checks if the original payment method is active. 
        if (trainee.paymentMethodActive == true) {
          //If the payment method is still active, the system will automatically deposit the correct amount
          //into the original payment method.
          system.depositAmount();
          
        }

        //if the payment method is not active, the deposit can't be made, a failure notification is sent to the trainee and finance manager.
        else if (trainee.paymentMethodActive == false) {
          //System automatically sends a notification to the trainee and finance manager
          //Message: Refund Failed.

        }
      }

      //If the trainee cancels less than 24 hours before the first training session, the refund will be denied.
      else if(trainee.twentyFourhoursBeforeFirstSession == false) {
        //A message will be automatically sent by the system to the trainee.
        //Message: Refund Denied.
      }

      //Training course has not started.
      if(trainingCourse.hasCourseStarted() == false) {
        //The system automatically updates the database to indicate there is a new position available, allowing someone else to book the position.
        system.makePositionAvailable();
      }

      //Now that the trainee has cancelled training, the system should automatically change the status of the trainee
      //to unregistered so they no longer have access to the training resources.
      system.changeStatusToUnregistered();

      //When the deposit is successful, the system will automatically send a notification to the trainee
      //that the refund has been successful.
      //Message: Refund Successful.
  }

  //Unregistered trainees won't be able to access this part of the system, and will not be able to request cancellation or refund.
  else if (trainee.isRegistered() == false) {

  }
  }
}