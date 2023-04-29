/* This Manager Class is used to create a manager object. 
 * The manager is responsible for selecting a training course,
 * creating a feedback poll, releasing the feedback poll to the
 * trainees, and viewing the results of the feedback poll.
 * Methods below explain these processes.
 */

public class Manager {

    //The manager selects a training course.
    public int selectTrainingCourse() {

        //Function will return the training course ID.
        return 0;
    }
    
    //When the manager creates a poll, this method is called and instanciates a feedback poll object,
    //and returns it to the manager object.
    public FeedbackPoll createPoll(int courseID) {
        //Instanciate a Feedback Poll object.
        FeedbackPoll feedbackPoll = new FeedbackPoll();
        return feedbackPoll;
    }

    //This method released the feedback poll that was created by the manager to the system,
    //so that the system can release it to the specified trainees enrolled in the training course.
    public void releasePoll(FeedbackPoll feedbackPoll) {
        
    }

    //The system returns a summary of results from all the trainee responses to the manager so they can be viewed.
    public String viewPollResults() {
        String results = "";
        return results;
    }

}
