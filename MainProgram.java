import java.util.Scanner;

public class MainProgram {
  public static void main(String[] args) {
    Trainee trainee = new Trainee("John Doe", 123456, true, 100, false, "Credit Card", true, true);
    System.out.println("Hello Trainee - " + trainee.getName() + "What would you like to do today?");
    System.out.println("1. View Trainee Details");
    System.out.println("2. Cancel Training");

    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();
    while (true)
    {
      if (choice == 1)
      {
        trainee.printTraineeDetails();
        choice = scanner.nextInt();
        
      }
      else if (choice == 2)
      {
        trainee.cancelTraining();
        choice = scanner.nextInt();
      }
      else
      {
        System.out.println("Invalid Choice. Please try again.");
        choice = scanner.nextInt();
      }
    }
  }
}