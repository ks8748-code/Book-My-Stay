import java.util.HashMap;

class RoomInventory {

    private HashMap<String, Integer> inventory;

    public RoomInventory() {
        inventory = new HashMap<>();
        inventory.put("Single Room", 10);
        inventory.put("Double Room", 5);
        inventory.put("Suite Room", 2);
    }

    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    public void updateAvailability(String roomType, int count) {
        inventory.put(roomType, count);
    }

    public void displayInventory() {
        System.out.println("===== Room Inventory =====");
        for (String roomType : inventory.keySet()) {
            System.out.println(roomType + " Available: " + inventory.get(roomType));
        }
    }
}

public class BookMyStay {

    public static void main(String[] args) {

        System.out.println("===== Book My Stay App v3.1 =====");

        RoomInventory inventory = new RoomInventory();

        inventory.displayInventory();

        System.out.println();

        inventory.updateAvailability("Single Room", 8);

        System.out.println("After Update:");
        inventory.displayInventory();
    }
}