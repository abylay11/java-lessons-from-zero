public class Truck extends Transport {

    private boolean isLoaded;

    public Truck(int weight, byte[] coordinate) {
        super(weight, coordinate);
    }

    public Truck(int weight, byte[] coordinate, boolean isLoaded) {
        super(weight, coordinate);
        this.isLoaded = isLoaded;
    }

//    @Override
    public void setValues(float speed, int weight, String color, byte[] coordinate, boolean isLoaded) {
        super.setValues(speed, weight, color, coordinate);
        this.isLoaded = isLoaded;
    }

    @Override
    protected String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }

    public String getLoaded() {
        if (isLoaded)
            return "Грузовик загружен";
        else
            return "Грузовик не загружен";
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Наш объект двигается со скоростью: " + speed);
    }

    @Override
    public boolean stopObject() {
        this.speed = 0;
        return true;
    }
}
