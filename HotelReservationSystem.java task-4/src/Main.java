import java.util.*;

class Room {
    int roomNumber;
    String type; // Standard, Deluxe, Suite
    boolean isBooked;

    Room(int roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.isBooked = false;
    }

    @Override
    public String toString() {
        return "Room " + roomNumber + " [" + type + "] - " + (isBooked ? "Booked" : "Available");
    }
}

 class HotelReservationSystem {
    static ArrayList<Room> rooms = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        setupRooms();

        while (true) {
            System.out.println("\n🏨 Hotel Reservation Menu:");
            System.out.println("1. View All Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayRooms();
                    break;
                case 2:
                    bookRoom(scanner);
                    break;
                case 3:
                    cancelRoom(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the Hotel Reservation System!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    static void setupRooms() {
        rooms.add(new Room(101, "Standard"));
        rooms.add(new Room(102, "Standard"));
        rooms.add(new Room(201, "Deluxe"));
        rooms.add(new Room(202, "Deluxe"));
        rooms.add(new Room(301, "Suite"));
        rooms.add(new Room(302, "Suite"));
    }

    static void displayRooms() {
        System.out.println("\nAvailable Room List:");
        for (Room room : rooms) {
            System.out.println(room);
        }
    }

    static void bookRoom(Scanner scanner) {
        System.out.print("Enter room number to book: ");
        int roomNum = scanner.nextInt();
        for (Room room : rooms) {
            if (room.roomNumber == roomNum) {
                if (!room.isBooked) {
                    room.isBooked = true;
                    System.out.println("Room " + roomNum + " booked successfully!");
                } else {
                    System.out.println("Room is already booked!");
                }
                return;
            }
        }
        System.out.println("Room not found.");
    }

    static void cancelRoom(Scanner scanner) {
        System.out.print("Enter room number to cancel: ");
        int roomNum = scanner.nextInt();
        for (Room room : rooms) {
            if (room.roomNumber == roomNum) {
                if (room.isBooked) {
                    room.isBooked = false;
                    System.out.println("Booking for room " + roomNum + " canceled.");
                } else {
                    System.out.println("Room is not booked.");
                }
                return;
            }
        }
        System.out.println("Room not found.");
    }
}