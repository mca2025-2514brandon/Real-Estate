import java.util.ArrayList;
import java.util.List;

/**
 * Represents a residential estate, which is a type of estate that implements
 * the Asset interface.
 * This class extends the Estate class and provides implementations for
 * registering and displaying asset information.
 * 
 * @author Brandon Noronha
 */
public class ResidentialEstate extends Estate implements Asset {

    // the list to hold asset details
    ArrayList<List<String>> assets = new ArrayList<>();

    /**
     * Constructs a new ResidentialEstate object with the specified details.
     *
     * @param estate_name the name of the estate
     * @param location    the location of the estate
     * @param price       the price of the estate
     * @param owner_name  the name of the estate owner
     * @param phone_num   the phone number of the estate owner
     * @param assets      a list of assets associated with the estate
     */
    public ResidentialEstate(String estate_name, String location, int price, String owner_name, int phone_num,
            ArrayList<List<String>> assets) {
        super(estate_name, location, price, owner_name, phone_num);
        this.assets = assets;
    }

    /**
     * Registers the assets for the residential estate.
     * This method takes a list of asset details and stores them in the assets
     * attribute.
     *
     * @param assets a list of assets to be registered, where each asset is
     *               represented as a list of strings
     *               containing details such as type, name, price, and description.
     */
    @Override
    public void registerAsset(ArrayList<List<String>> assets) {
        // Implementation for registering a residential estate asset
        this.assets = assets;

        System.out.println("Asset registered successfully!");
    }

    /**
     * Displays the asset information for the residential estate.
     * This method prints the details of each asset associated with the estate to
     * the standard output.
     */
    @Override
    public void displayAssetInfo() {
        System.out.println("\nAsset Information for " + super.name + ":");
        for (List<String> asset : assets) {
            System.out.println("Asset Type: " + asset.get(0));
            System.out.println("Asset Name: " + asset.get(1));
            System.out.println("Asset Price: " + asset.get(2));
            System.out.println("Asset Description: " + asset.get(3));
            System.out.println("---------------------------");
        }
    }


    /**
     * Displays the details of the residential estate, including its name, location,
     * price, owner name, and phone number. Also calls {@code displayAssetInfo()} to
     * show additional asset information.
     */
    public void getEstateDetails() {
        System.out.println("---------------------------");
        System.out.println("Estate Name: " + super.name);
        System.out.println("Location: " + super.location);
        System.out.println("Price: " + super.price);
        System.out.println("Owner Name: " + super.owner);
        System.out.println("Phone Number: " + super.phone_number);
        displayAssetInfo();
    }
}
