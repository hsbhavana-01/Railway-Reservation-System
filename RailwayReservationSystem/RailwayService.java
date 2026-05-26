import java.io.*;
import java.util.*;

public class RailwayService {
    static Scanner sc = new Scanner(System.in);

    public static void addTrain() {
        try (FileWriter fw = new FileWriter("trains.txt", true)) {
            System.out.print("Train ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Train Name: ");
            String name = sc.nextLine();

            System.out.print("Source: ");
            String source = sc.nextLine();

            System.out.print("Destination: ");
            String dest = sc.nextLine();

            System.out.print("Seats: ");
            int seats = sc.nextInt();

            fw.write(id + "," + name + "," + source + "," + dest + "," + seats + "\n");
            System.out.println("Train Added!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void viewTrains() {
        try (BufferedReader br = new BufferedReader(new FileReader("trains.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("No train records found.");
        }
    }

    public static void bookTicket() {
        try (FileWriter fw = new FileWriter("bookings.txt", true)) {
            System.out.print("Booking ID: ");
            int bookingId = sc.nextInt();

            System.out.print("Passenger ID: ");
            int passengerId = sc.nextInt();

            System.out.print("Train ID: ");
            int trainId = sc.nextInt();

            fw.write(bookingId + "," + passengerId + "," + trainId + "\n");
            System.out.println("Ticket Booked!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}