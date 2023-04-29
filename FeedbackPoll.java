/* This Class is called FeedbackPoll, and is used to create
 * a feedback poll object. The feedback poll is created by the manager
 * after they have selected a training course. The feedback poll will
 * contain a list of questions that the trainee will answer.
 */

public class FeedbackPoll {

    //Stores the number of trainees who have completed the poll.
    public int numberOfCompletedPolls;

    //A boolean to check if the poll submission deadline has passed.
    public boolean pollSubmissionDatePassed;

    //This is the feedback poll that will be created by the manager when when he
    //creates a feedback poll for a specific training course.
    //The poll will contain a list of questions such as the three examples below:
    public String question1 = "What did you enjoy most about this course?";
    public String question2 = "What did you enjoy least about this course?";
    public String question3 = "What could be improved about this course?";

}
