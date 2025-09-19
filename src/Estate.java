/**
 * Represents a real estate property with details such as name, location, price,
 * and ownership.
 * Inherits owner information from the {@link Owner} class.
 *
 * <p>
 * Each Estate object contains:
 * <ul>
 * <li>Name of the estate</li>
 * <li>Location of the estate</li>
 * <li>Price of the estate</li>
 * <li>Owner's name and phone number (inherited)</li>
 * </ul>
 * </p>
 *
 * @author Brandon Noronha
 */
public class Estate extends Owner {
    protected String location;
    protected String name;
    protected int price;

    /**
     * Constructs a new Estate object with the specified name, location, price,
     * owner name, and phone number.
     *
     * @param name       the name of the estate
     * @param location   the location of the estate
     * @param price      the price of the estate
     * @param owner_name the name of the estate owner
     * @param phone_num  the phone number of the estate owner
     */
    public Estate(String name, String location, int price, String owner_name, int phone_num) {
        super(owner_name, phone_num);
        this.name = name;
        this.location = location;
        this.price = price;
    }

}
