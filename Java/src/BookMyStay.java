abstract class Room {
    String type;
    int beds;
    double price;

    Room(String type, int beds, double price) {
        this.type = type;
        this.beds = beds;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Room Type: " + type);
        System.out.println("Beds: " + beds);
        System.out.println("Price: ₹" + price);
    }
}

class SingleRoom extends Room {
    SingleRoom() {
        super("Single Room", 1, 2000);
    }
}

class DoubleRoom extends Room {
    DoubleRoom() {
        super("Double Room", 2, 3500);
    }
}

class SuiteRoom extends Room {
    SuiteRoom() {
        super("Suite Room", 3, 6000);
    }
}

public class BookMyStay {

    public static void main(String[] args) {

        Room single = new SingleRoom();
        Room doub = new DoubleRoom();
        Room suite = new SuiteRoom();

        int singleAvailability = 10;
        int doubleAvailability = 5;
        int suiteAvailability = 2;

        System.out.println("===== Book My Stay App v2.1 =====");

        single.displayDetails();
        System.out.println("Available: " + singleAvailability);
        System.out.println();

        doub.displayDetails();
        System.out.println("Available: " + doubleAvailability);
        System.out.println();

        suite.displayDetails();
        System.out.println("Available: " + suiteAvailability);
    }
}

