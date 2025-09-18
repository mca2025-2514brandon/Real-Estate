/**
 * Represents a residential estate asset, extending the Estate class and implementing the Asset interface.
 * This class provides functionality to register and display information about a residential estate asset.
 *
 * <p>
 * Fields include asset type, name, price, and description.
 * </p>
 *
 * <p>
 * Example usage:
 * <pre>
 * ResidentialEstate estate = new ResidentialEstate("Green Villa", "Downtown", 500000, "John Doe", 1234567890);
 * estate.registerAsset("House", "Green Villa", 500000, "A spacious villa in the city center.");
 * estate.displayAssetInfo();
 * </pre>
 * </p>
 *
 * @author Brandon Noronha
 */
public class ResidentialEstate extends Estate implements Asset {
    // String secondary_owner;
    String asset_description, asset_type, asset_name;
    int asset_price;

    /**
     * Constructs a new ResidentialEstate object with the specified details.
     *
     * @param estate_name the name of the estate
     * @param location the location of the estate
     * @param price the price of the estate
     * @param owner_name the name of the owner
     * @param phone_num the phone number of the owner
     */
    public ResidentialEstate(String estate_name, String location, int price, String owner_name, int phone_num) {
        super(estate_name, location, price, owner_name, phone_num);
    }

    /**
     * Registers a residential estate asset with the specified details.
     *
     * @param type  the type of the asset (e.g., "Apartment", "House")
     * @param name  the name of the asset
     * @param price the price of the asset
     * @param about a brief description of the asset
     */
    @Override
    public void registerAsset(String type, String name, int price, String about) {
        // Implementation for registering a residential estate asset
        this.asset_type = type;
        this.asset_name = name;
        this.asset_price = price;
        this.asset_description = about;

        System.out.println("Asset registered successfully!");
    }

    /**
     * Displays detailed information about the residential estate asset,
     * including its type, name, price, and description.
     * This method overrides the base implementation to provide
     * specific details for residential estate assets.
     */
    @Override
    public void displayAssetInfo() {
        System.out.println("Asset Type: " + asset_type);
        System.out.println("Asset Name: " + asset_name);
        System.out.println("Asset Price: " + asset_price);
        System.out.println("Asset Description: " + asset_description);
    }

}
