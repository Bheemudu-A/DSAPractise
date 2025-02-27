package practise.interviewPrograms.siemen;

import java.util.*;

class ParkingLot {
    private int capacity;
    private PriorityQueue<Integer> availableSlots; // Min-heap for nearest available slot
    private Map<Integer, String> parkedCars; // Slot -> Vehicle Registration

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.availableSlots = new PriorityQueue<>();
        this.parkedCars = new HashMap<>();

        // Initialize all slots as available
        for (int i = 1; i <= capacity; i++) {
            availableSlots.offer(i);
        }
    }

    // Park a vehicle
    public int parkVehicle(String vehicleReg) {
        if (availableSlots.isEmpty()) {
            System.out.println("Parking Lot is full!");
            return -1;
        }
        int slot = availableSlots.poll();
        parkedCars.put(slot, vehicleReg);
        System.out.println("Vehicle " + vehicleReg + " parked at slot " + slot);
        return slot;
    }

    // Remove a vehicle
    public void removeVehicle(int slot) {
        if (!parkedCars.containsKey(slot)) {
            System.out.println("No vehicle found at slot " + slot);
            return;
        }
        String vehicleReg = parkedCars.remove(slot);
        availableSlots.offer(slot); // Add the slot back to available slots
        System.out.println("Vehicle " + vehicleReg + " removed from slot " + slot);
    }

    // Display parked vehicles
    public void displayParkedCars() {
        if (parkedCars.isEmpty()) {
            System.out.println("No vehicles parked.");
            return;
        }
        System.out.println("Parked Vehicles:");
        for (Map.Entry<Integer, String> entry : parkedCars.entrySet()) {
            System.out.println("Slot " + entry.getKey() + ": " + entry.getValue());
        }
    }
    

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(5); // Create a parking lot with 5 slots

        parkingLot.parkVehicle("Bike 1");
        parkingLot.parkVehicle("Bike 2");
        parkingLot.parkVehicle("Bike 3");
        parkingLot.parkVehicle("Bike 4");
        parkingLot.parkVehicle("Bike 5");
        parkingLot.parkVehicle("Bike 6");

        parkingLot.displayParkedCars();

        parkingLot.removeVehicle(2);
        parkingLot.parkVehicle("Bike 8");

        parkingLot.displayParkedCars();
    }
}




