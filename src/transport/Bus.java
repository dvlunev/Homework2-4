package transport;

public class Bus extends Transport implements Competing {

    public Bus(String brand,
               String model,
               double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMove() {
        System.out.println("Автобус " + getBrand() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Автобус " + getBrand() + " закончил движение");
    }

    @Override
    public void refill() {
        System.out.println("Автобус " + getBrand() + " заполнен топливом");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус заехал на питстоп");
    }

    @Override
    public int bestLapTime() {
        return (int) (Math.random() + 15);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() + 100);
    }
}
