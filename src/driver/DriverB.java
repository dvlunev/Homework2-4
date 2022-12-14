package driver;

import transport.Car;

public class DriverB extends Driver<Car> {

    public DriverB(String fullName,
                   boolean driverLicense,
                   int experience) {
        super(fullName, driverLicense, experience);
    }

    @Override
    public void startMove(Car transport) {
        if (isDriverLicense()) {
            transport.startMove();
        }
    }

    @Override
    public void finishMove(Car transport) {
        if (isDriverLicense()) {
            transport.finishMove();
        }
    }

    @Override
    public void refill(Car transport) {
        if (isDriverLicense()) {
            transport.refill();
        }
    }
}
