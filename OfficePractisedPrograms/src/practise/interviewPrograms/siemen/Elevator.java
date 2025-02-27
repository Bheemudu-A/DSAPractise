package practise.interviewPrograms.siemen;

import java.util.*;

class Elevator {
    private int currentFloor;
    private TreeSet<Integer> upRequests;   // Stores requests going UP (sorted)
    private TreeSet<Integer> downRequests; // Stores requests going DOWN (sorted in reverse order)
    private boolean movingUp; // Elevator direction

    public Elevator() {
        this.currentFloor = 0; // Start at ground floor
        this.upRequests = new TreeSet<>();
        this.downRequests = new TreeSet<>(Collections.reverseOrder());
        this.movingUp = true; // Default direction is UP
    }

    // Request a floor
    public void requestFloor(int floor) {
        if (floor > currentFloor) {
            upRequests.add(floor);
        } else if (floor < currentFloor) {
            downRequests.add(floor);
        }
        System.out.println("Request added for floor " + floor);
    }

    // Process elevator movement
    public void moveElevator() {
        while (!upRequests.isEmpty() || !downRequests.isEmpty()) {
            if (!upRequests.isEmpty()) {
                moveUp();
            } else {
                moveDown();
            }
        }
        System.out.println("Elevator is now idle at floor " + currentFloor);
    }

    // Move elevator up
    private void moveUp() {
        while (!upRequests.isEmpty()) {
            currentFloor = upRequests.pollFirst(); // Get the lowest available floor
            System.out.println("Elevator moving up to floor " + currentFloor);
        }
    }

    // Move elevator down
    private void moveDown() {
        while (!downRequests.isEmpty()) {
            currentFloor = downRequests.pollFirst(); // Get the highest available floor in reverse order
            System.out.println("Elevator moving down to floor " + currentFloor);
        }
    }

    public static void main(String[] args) {
        Elevator elevator = new Elevator();

        // Floor requests
        elevator.requestFloor(3);
        elevator.requestFloor(1);
        elevator.requestFloor(5);
        elevator.requestFloor(2);
        elevator.requestFloor(-2);

        // Start elevator movement
        elevator.moveElevator();
    }
}

