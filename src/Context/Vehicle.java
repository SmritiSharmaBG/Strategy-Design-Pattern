package Context;

import Strategy.IDriveCapability;

/**
 * Vehicle is an object that has some properties like :
 * Colour, Drive Capability, seats
 */
public class Vehicle {
    private String colour;
    private IDriveCapability driveCapability;
    private int seats;

    public Vehicle(String colour, IDriveCapability driveCapability, int seats) {
        this.colour = colour;
        this.driveCapability = driveCapability;
        this.seats = seats;
    }

    public void drive() {
        driveCapability.drive();
    }

    // Further we can implement other features of Vehicle
}
