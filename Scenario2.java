public class Scenario2 {

    public static void main(String[] args) {
        
        //Instanciate a Manager object.
        //Feedback poll object is instanciated inside the createPoll function in the Manager class.
        Manager manager = new Manager();

        //Instanciate the System.
        TheSystem system = new TheSystem();

        //Instanciate a Trainee object.
        Trainee trainee = new Trainee("John", 123456, true, 100, false, true, true);

        //Instanciate a Training Course Object.
        TrainingCourse trainingCourse = new TrainingCourse();

        //Manager selects a training course that he wants to create the feedback poll for.
        //The function will return the training course ID.
        int trainingCourseId = manager.selectTrainingCourse();

        //The manager creates the training poll for the selected course.
        //The function returns the created poll object.
        FeedbackPoll newFeedbackPoll = manager.createPoll(trainingCourseId);

        //First the manager releases the poll to the system.
        manager.releasePoll(newFeedbackPoll);

        //The course must have reached its end date, and one trainee must have completed the course before a poll can be released.
        if (trainingCourse.courseIsFinished == true && trainingCourse.numberOfStudentsCompleted > 0){

            //Then the system releases the poll to each trainee in the selected training course.
            system.releasePoll(trainingCourseId, newFeedbackPoll);

            //The trainee can open and complete the feedback poll.
            //When they submit the poll, it is automatically stored by the system.
            //This function demonstrates one trainee, but all trainees enrolled in the selected training course would
            //have the option to complete the poll.
            trainee.completePoll(newFeedbackPoll);

            //The system automaticaly stores all completed polls. This could be stored in a database.
            system.storePoll(newFeedbackPoll);

            //Checks to see if at least one student has completed the poll and the poll submission deadline has passed.
            if (newFeedbackPoll.numberOfCompletedPolls > 0 && newFeedbackPoll.pollSubmissionDatePassed == true)
            {
                //Message: The system will notify the manager who created the poll that the results are ready.

                //After being notified the results are ready to view, the manager can click on view poll results which will
                //return the summary of results.
                manager.viewPollResults();
            }

        }
}
}