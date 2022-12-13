package driver;

import transport.Bus;

public class DriverD extends Driver<Bus> {

    public DriverD(String fullName,
                   boolean driverLicense,
                   int experience) {
        super(fullName, driverLicense, experience);
    }

    @Override
    public void startMove(Bus transport) {
        if (isDriverLicense()) {
            transport.startMove();
        }
    }

    @Override
    public void finishMove(Bus transport) {
        if (isDriverLicense()) {
            if (isDriverLicense()) {
                transport.finishMove();
            }
        }
    }

    @Override
    public void refill(Bus transport) {
        if (isDriverLicense()) {
            transport.refill();
        }
    }
}
