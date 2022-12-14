import driver.DriverB;
import driver.DriverC;
import driver.DriverD;
import transport.Bus;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");
        Bus bus1 = new Bus(
                "Scania",
                "A80 4x2",
                6
        );
        Bus bus2 = new Bus(
                "Газ",
                "5292",
                5.0
        );
        Bus bus3 = new Bus(
                "МАЗ",
                "3432",
                4.5
        );
        Bus bus4 = new Bus(
                "ВАЗ",
                "124",
                4.0
        );

        Car car1 = new Car(
                "Hyundai",
                "Avante",
                2
        );
        Car car2 = new Car(
                "Kia",
                "Sportage 4-го поколения",
                2.4
        );
        Car car3 = new Car(
                "BMW",
                "Z8",
                3
        );
        Car car4 = new Car(
                "Audi",
                "A6",
                2.6
        );
        Truck truck1 = new Truck(
                "Камаз",
                "54654",
                5.5
        );
        Truck truck2 = new Truck(
                "Hyundai",
                "A353",
                4.5
        );
        Truck truck3 = new Truck(
                "ВАЗ",
                "2152",
                3.5
        );
        Truck truck4 = new Truck(
                "МАЗ",
                "553",
                2
        );

        bus1.startMove();
        bus1.finishMove();

        car1.startMove();
        car1.finishMove();

        truck1.startMove();
        truck1.finishMove();

        System.out.println();

        //Задание 3
        System.out.println("Задание 3");
        bus2.pitStop();
        System.out.println("bus2.bestLapTime() = " + bus2.bestLapTime());
        System.out.println("bus2.maxSpeed() = " + bus2.maxSpeed());
        car2.pitStop();
        System.out.println("car2.bestLapTime() = " + car2.bestLapTime());
        System.out.println("car2.maxSpeed() = " + car2.maxSpeed());
        truck2.pitStop();
        System.out.println("truck2.bestLapTime() = " + truck2.bestLapTime());
        System.out.println("truck2.maxSpeed() = " + truck2.maxSpeed());
        System.out.println();

        //Задание 4
        System.out.println("Задание 4");
        DriverB ddd = new DriverB("Дмитриев Дмитрий Дмитриевич", true, 5);
        DriverC iii = new DriverC("Иванов Иван Иванович", true, 4);
        DriverD aaa = new DriverD("Александров Александр Александрович", false, 3);
        ddd.checkDriver(car3);
        ddd.startMove(car3);
        ddd.finishMove(car3);
        ddd.refill(car3);
        iii.checkDriver(truck3);
        iii.startMove(truck3);
        iii.finishMove(truck3);
        iii.refill(truck3);
        aaa.checkDriver(bus3);
        aaa.startMove(bus3);
        aaa.finishMove(bus3);
        aaa.refill(bus3);
    }
}