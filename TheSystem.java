public class TheSystem {

    //If the finance manager approves the refund, the system will automatically 
    //refund the amount using the trainees original payment method.
    public boolean depositAmount() {
        //if deposit succesful, the trainee has recieved the money and returns true, and automatically sends a notification 
        //to the trainee that the refund has been successful.
        return true;
    }

    //If the training course has not already started, the system automatically updates the database 
    //to indicate there is a new position availabl, allowing someone else to book the position.
    public boolean makePositionAvailable() {
        return true;
    }

    //After the trainee cancels training, the system should automatically change their status to unregisretered,
    //so they can no longer access the training resources. 
    public boolean changeStatusToUnregistered() {
        return true;
    }


}
