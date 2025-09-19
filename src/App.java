import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        int option = 0;
        String estate_name, location, owner_name;
        int price, phone_num;

        System.out.println("Welcome to the Estate dealer portal!");

        Scanner input = new Scanner(System.in);
        // List to hold registered estates
        ArrayList<ResidentialEstate> estates = new ArrayList<>();

        while (option != 3) {
            System.out.println("\nWhat do you want to do next?");
            System.out.println("Enter 1 to book an Estate");
            System.out.println("Enter 2 to Register an Estate");
            System.out.println("Enter 3 to Exit the program");
            System.out.print("Enter your option: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    if (estates.size() == 0) {
                        System.out.println("No estates registered yet. Please register an estate first.");
                        break;
                    }

                    System.out.println("\nBooking Estates");

                    System.out.println("Available Estates:");
                    // Display the list of registered estates
                    for (int i = 0; i < estates.size(); i++) {
                        estates.get(i).getEstateDetails();
                    }

                    // Prompt for booking
                    System.out.print("Enter the number of the estate you want to book: ");
                    int estate_choice = input.nextInt();
                    if (estate_choice < 1 || estate_choice > estates.size()) {
                        System.out.println("Invalid choice. Please try again.");
                        break;
                    }
                    // Get the selected estate
                    ResidentialEstate selected_estate = estates.get(estate_choice - 1);
                    // Display selected estate details
                    System.out.println("You have selected: " + selected_estate.name);
                    selected_estate.displayOwnerDetails();
                    // selected_estate.displayAssetInfo();
                    System.out.println("Estate booked successfully!");

                    break;

                case 2:
                    System.out.println("\nRegistering Estates");
                    System.out.println("How many estates do you want to register?");
                    int num_estates = input.nextInt();
                    for (int i = 0; i < num_estates; i++) {
                        System.out.println("Enter details for estate " + (i + 1) + ":");
                        System.out.print("Estate Name: ");
                        input.nextLine(); // consume leftover newline
                        estate_name = input.nextLine();
                        System.out.print("Location: ");
                        location = input.nextLine();
                        System.out.print("Owner Name: ");
                        owner_name = input.nextLine();
                        System.out.print("Price: ");
                        price = input.nextInt();
                        System.out.print("Phone Number: ");
                        phone_num = input.nextInt();

                        // Register assets for the estate
                        ArrayList<List<String>> assets = registerAsset(input, estate_name);
                        // Create and add the new estate to the list
                        ResidentialEstate estate = new ResidentialEstate(estate_name, location, price, owner_name,
                                phone_num, assets);
                        estates.add(estate);

                        System.out.println("Estate registered successfully!");
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);// Exit the program
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        }
    }

    static ArrayList<List<String>> registerAsset(Scanner input, String estate_name) {
        System.out.println("How many assets do you want to register for " + estate_name + "?");
        int num_assets = input.nextInt();
        ArrayList<List<String>> assets = new ArrayList<>();

        for (int i = 0; i < num_assets; i++) {
            System.out.println("Enter details for asset " + (i + 1) + ":");
            // Collect asset details from the user
            System.out.print("Asset Type: ");
            String type = input.nextLine();
            if (type.isEmpty()) type = input.nextLine(); // consume leftover newline
            System.out.print("Asset Name: ");
            String name = input.nextLine();
            System.out.print("Asset Price: ");
            String price = input.nextLine();
            System.out.print("Asset Description: ");
            String description = input.nextLine();

            // Create a list to hold asset details and add it to the assets list
            List<String> asset = new ArrayList<>();
            asset.add(type);
            asset.add(name);
            asset.add(price);
            asset.add(description);
            assets.add(asset);
        }
        return assets;
    }
}
