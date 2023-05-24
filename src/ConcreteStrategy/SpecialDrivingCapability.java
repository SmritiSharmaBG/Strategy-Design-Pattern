package ConcreteStrategy;

import Strategy.IDriveCapability;

public class SpecialDrivingCapability implements IDriveCapability {
    @Override
    public void drive() {
        System.out.println("Special Driving Capability implemented");
    }
}
