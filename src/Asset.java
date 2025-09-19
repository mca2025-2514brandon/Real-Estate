import java.util.ArrayList;
import java.util.List;

/**
 * The Asset interface defines the contract for asset-related operations
 * in the real estate system.
 * <p>
 * Implementing classes should provide mechanisms to register asset details
 * and display asset information.
 * </p>
 */
public interface Asset {
    void registerAsset(ArrayList<List<String>> assets);

    void displayAssetInfo();
}
