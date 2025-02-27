package practise.interviewPrograms.parking;

import java.util.*;

class ParkingLot {
    private final int capacity;
    private final PriorityQueue<Integer> availableSlots; // Min-Heap to store available slots
    private final Map<Integer, String> slotToVehicle; // Mapping slot number to vehicle number
    private final Map<String, Integer> vehicleToSlot; // Mapping vehicle number to slot number

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.availableSlots = new PriorityQueue<>();
        this.slotToVehicle = new HashMap<>();
        this.vehicleToSlot = new HashMap<>();

        // Initialize available slots
        for (int i = 1; i <= capacity; i++) {
            availableSlots.add(i);
        }
    }

    // Park a vehicle in the nearest available slot
    public boolean parkVehicle(String vehicleNumber) {
        if (vehicleToSlot.containsKey(vehicleNumber)) {
            System.out.println("Vehicle already parked.");
            return false;
        }

        if (availableSlots.isEmpty()) {
            System.out.println("Parking Lot Full!");
            return false;
        }

        int slot = availableSlots.poll(); // Get the nearest available slot
        slotToVehicle.put(slot, vehicleNumber);
        vehicleToSlot.put(vehicleNumber, slot);

        System.out.println("Vehicle " + vehicleNumber + " parked at slot " + slot);
        return true;
    }

    // Remove a vehicle from the parking lot
    public boolean removeVehicle(String vehicleNumber) {
        if (!vehicleToSlot.containsKey(vehicleNumber)) {
            System.out.println("Vehicle not found in parking lot.");
            return false;
        }

        int slot = vehicleToSlot.get(vehicleNumber);
        vehicleToSlot.remove(vehicleNumber);
        slotToVehicle.remove(slot);
        availableSlots.add(slot); // Add slot back to available slots

        System.out.println("Vehicle " + vehicleNumber + " removed from slot " + slot);
        return true;
    }

    // Find a vehicle's parking slot
    public int findVehicle(String vehicleNumber) {
        return vehicleToSlot.getOrDefault(vehicleNumber, -1);
    }

    // Display available parking slots
    public void displayAvailableSlots() {
        if (availableSlots.isEmpty()) {
            System.out.println("No available slots.");
        } else {
            System.out.println("Available Slots: " + availableSlots);
        }
    }



    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(5); // Parking lot with 5 slots

        parkingLot.parkVehicle("KA-01-1234");
        parkingLot.parkVehicle("KA-02-5678");
        parkingLot.parkVehicle("KA-03-9876");

        parkingLot.displayAvailableSlots();

        System.out.println("Vehicle KA-02-5678 is at slot: " + parkingLot.findVehicle("KA-02-5678"));

        parkingLot.removeVehicle("KA-02-5678");
        parkingLot.displayAvailableSlots();

        parkingLot.parkVehicle("KA-04-1111");
        parkingLot.parkVehicle("KA-05-2222");
        parkingLot.parkVehicle("KA-06-3333"); // Should fail (Parking Lot Full)

        parkingLot.displayAvailableSlots();
    }
}

