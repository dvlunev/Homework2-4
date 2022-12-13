package transport;

public class Truck extends Transport implements Competing {

    public Truck(String brand,
                 String model,
                 double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMove() {
        System.out.println("Грузовик " + getBrand() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Грузовик " + getBrand() + " закончил движение");
    }

    public void refill() {
        System.out.println("Грузовик " + getBrand() + " заполнен топливом");
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовой автомобиль заехал на питстоп");
    }

    @Override
    public int bestLapTime() {
        return (int) (Math.random() + 14);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() + 110);
    }
}
