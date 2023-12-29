public class Main {
    public static void main(String[] args) {
        // ООП: Конструкторы класса
        Truck truck = new Truck(5600, new byte[] {100, 0, 100}, false);
        truck.setValues(250.5f, 2500, "White", new byte[] {0,0,0}, true);
        System.out.println(truck.getValues());
    }
}