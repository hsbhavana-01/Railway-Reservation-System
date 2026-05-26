import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Railway Reservation System =====");
            System.out.println("1. Add Train");
            System.out.println("2. View Trains");
            System.out.println("3. Book Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    RailwayService.addTrain();
                    break;
                case 2:
                    RailwayService.viewTrains();
                    break;
                case 3:
                    RailwayService.bookTicket();
                    break;
                case 4:
                    System.out.println("Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}