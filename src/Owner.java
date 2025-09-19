/**
 * Represents an owner with a name and phone number.
 */
public class Owner {
    protected String owner;
    protected int phone_number;

    /**
     * Constructs an Owner object with the specified name and phone number.
     *
     * @param name the name of the owner
     * @param phone the phone number of the owner
     */
    public Owner(String name, int phone) {
        this.owner = name;
        this.phone_number = phone;
    }

    /**
     * Displays the details of the owner, including the owner's name and phone number,
     * by printing them to the standard output.
     */
    public void displayOwnerDetails() {
        System.out.println("Owner: " + owner);
        System.out.println("Phone Number: " + phone_number);
    }
}
