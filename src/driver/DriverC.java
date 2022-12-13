package driver;

import transport.Truck;

public class DriverC extends Driver<Truck> {

    public DriverC(String fullName,
                   boolean driverLicense,
                   int experience) {
        super(fullName, driverLicense, experience);
    }

    @Override
    public void startMove(Truck transport) {
        if (isDriverLicense()) {
            transport.startMove();
        }
    }

    @Override
    public void finishMove(Truck transport) {
        if (isDriverLicense()) {
            transport.finishMove();
        }
    }

    @Override
    public void refill(Truck transport) {
        if (isDriverLicense()) {
            transport.refill();
        }
    }
}
