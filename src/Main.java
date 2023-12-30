public class Main {
    public static void main(String[] args) {
        // ООП: Конструкторы класса
        Car car = new Car(250.5f, 2500, "White", new byte[] {0,0,0});
        car.engine.setValues(true, 10);
        car.engine.info();

        Truck truck = new Truck(5600, new byte[] {100, 0, 100}, false);
        truck.engine.setValues(false, 1000);
        truck.engine.info();
//        truck.setValues(250.5f, 2500, "White", new byte[] {0,0,0}, true);
//        System.out.println(truck.getValues());

        Car flyCar = new Car(250.5f, 2500, "White", new byte[] {0,0,0}) {
            @Override
            public void moveObject(float speed) {
                super.moveObject(speed);
                this.engine.isReady(true);
                System.out.println("Машина летит");
            }
        };

        flyCar.moveObject(450);
    }
}