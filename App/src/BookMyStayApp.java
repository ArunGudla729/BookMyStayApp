import java.io.*;
import java.util.*;

/**
 * =============================================================================
 * MAIN CLASS - UseCase12DataPersistenceRecovery
 * =============================================================================
 * Use Case 12: Data Persistence & System Recovery
 *
 * Description:
 * This class demonstrates how system state can be restored after an application
 * restart. Inventory data is loaded from a file before any bookings occur.
 *
 * @version 12.0
 */
public class BookMyStayApp {
    public static void main(String[] args) {
        System.out.println("Use Case 12: Data Persistence & System Recovery\n");

        PersistenceManager persistence = new PersistenceManager();
        RoomInventory inventory;

        // 1. System Recovery: Attempt to load existing state
        inventory = persistence.loadInventory();
        inventory.displayStatus();

        // 2. Simulate a Booking & Persistence
        System.out.println("\nProcessing new booking for 'Single' room...");
        if (inventory.reserve("Single")) {
            persistence.saveInventory(inventory);
            System.out.println("System state updated and persisted to file.");
        }

        inventory.displayStatus();
    }
}

/**
 * Handles File I/O for saving and loading inventory state.
 */
class PersistenceManager {
    private final String FILE_NAME = "inventory_state.txt";

    public void saveInventory(RoomInventory inv) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Map.Entry<String, Integer> entry : inv.getRooms().entrySet()) {
                writer.println(entry.getKey() + ":" + entry.getValue());
            }
        } catch (IOException e) {
            System.err.println("Error saving state: " + e.getMessage());
        }
    }

    public RoomInventory loadInventory() {
        RoomInventory inv = new RoomInventory();
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            System.out.println("System Recovery: No valid inventory data found. Starting fresh.");
            return inv; // Returns default values
        }

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(":");
                if (parts.length == 2) {
                    inv.setRoomCount(parts[0], Integer.parseInt(parts[1]));
                }
            }
            System.out.println("System Recovery: State recovered successfully from file.");
        } catch (IOException | NumberFormatException e) {
            System.out.println("System Recovery: Error loading file. Starting fresh.");
        }
        return inv;
    }
}

class RoomInventory {
    private Map<String, Integer> rooms = new HashMap<>();

    public RoomInventory() {
        // Default starting inventory
        rooms.put("Single", 5);
        rooms.put("Double", 3);
        rooms.put("Suite", 2);
    }

    public void setRoomCount(String type, int count) { rooms.put(type, count); }
    public Map<String, Integer> getRooms() { return rooms; }

    public boolean reserve(String type) {
        if (rooms.getOrDefault(type, 0) > 0) {
            rooms.put(type, rooms.get(type) - 1);
            return true;
        }
        return false;
    }

    public void displayStatus() {
        System.out.println("Current Inventory: " + rooms);
    }
}
