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

    public HashMap<String, Integer> getAllAvailability() {
        return new HashMap<>(inventory);
    }

    public void updateAvailability(String roomType, int count) {
        inventory.put(roomType, count);
    }
}

class RoomSearch {

    private RoomInventory inventory;

    public RoomSearch(RoomInventory inventory) {
        this.inventory = inventory;
    }

    public void searchAllRooms() {
        System.out.println("===== Available Rooms =====");
        HashMap<String, Integer> data = inventory.getAllAvailability();

        for (String roomType : data.keySet()) {
            System.out.println(roomType + " Available: " + data.get(roomType));
        }
    }

    public void searchRoom(String roomType) {
        int available = inventory.getAvailability(roomType);
        System.out.println(roomType + " Available: " + available);
    }
}

public class BookMyStay {

    public static void main(String[] args) {

        System.out.println("===== Book My Stay App v4.1 =====");

        RoomInventory inventory = new RoomInventory();
        RoomSearch search = new RoomSearch(inventory);

        search.searchAllRooms();

        System.out.println();

        search.searchRoom("Single Room");
    }
}