import java.sql.Date;

public class FeedbackPoll {

    public int numberOfCompletedPolls;
    public boolean pollSubmissionDatePassed;

    //This is the feedback poll that will be created by the manager when when he
    //creates a feedback poll for a specific training course.
    //The poll will contain a list of questions such as the three examples below:
    public String question1 = "What did you enjoy most about this course?";
    public String question2 = "What did you enjoy least about this course?";
    public String question3 = "What could be improved about this course?";

}
