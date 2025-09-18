import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        int option = 0;
        String estate_name, location, owner_name;
        int price, phone_num;


        System.out.println("Welcome to the Estate dealer portal!");

        Scanner input = new Scanner(System.in);
        ArrayList<ResidentialEstate> estates=new ArrayList<>();


        while (option != 3) {
            System.out.println("\nWhat do you want to do next?");
            System.out.println("Enter 1 to book an Estate");
            System.out.println("Enter 2 to Register an Estate");
            System.out.println("Enter 3 to Exit the program");
            System.out.print("Enter your option: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Booking an Estate");

                    break;
                case 2:
                    System.out.println("Registering an Estate");
                    System.out.print("How many estates do you want to register?");
                    int num_estates = input.nextInt();
                    for (int i = 0; i < num_estates; i++) {
                        System.out.println("Enter details for estate " + (i + 1) + ":");
                        System.out.print("Estate Name: ");
                        estate_name = input.next();
                        System.out.print("Location: ");
                        location = input.next();
                        System.out.print("Owner Name: ");
                        owner_name = input.next();
                        System.out.print("Price: ");
                        price = input.nextInt();
                        System.out.print("Phone Number: ");
                        phone_num = input.nextInt();

                        ResidentialEstate estate = new ResidentialEstate(estate_name, location, price, owner_name, phone_num);
                        estates.add(estate);
                    }
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        }
    }
}
