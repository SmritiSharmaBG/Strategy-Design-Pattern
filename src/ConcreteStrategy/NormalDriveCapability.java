package ConcreteStrategy;

import Strategy.IDriveCapability;

public class NormalDriveCapability implements IDriveCapability {
    @Override
    public void drive() {
        System.out.println("Normal Driving Capability implemented");
    }
}
