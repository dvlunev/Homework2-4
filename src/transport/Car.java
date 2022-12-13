package transport;

public class Car extends Transport implements Competing {

    public Car(String brand,
               String model,
               double engineVolume) {
        super(brand,model, engineVolume);
    }

    @Override
    public void startMove() {
        System.out.println("Автомобиль " + getBrand() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Автомобиль " + getBrand() + " закончил движение");
    }

    public void refill() {
        System.out.println("Автомобиль " + getBrand() + " заполнен топливом");
    }

    @Override
    public void pitStop() {
        System.out.println("Легковой автомобиль заехал на питстоп");
    }

    @Override
    public int bestLapTime() {
        return (int) (Math.random() + 7);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() + 190);
    }
}
