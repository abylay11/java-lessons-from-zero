public abstract class Transport {
    protected float speed;
    private int weight;
    private String color;
    private byte[] coordinate;


    public Transport(float _speed, int _weight, String _color, byte[] _coordinate) {
        // Join to DB
        System.out.println("Object created");
        this.setValues(_speed, _weight, _color, _coordinate);
//        System.out.println(this.getValues());
    }
    public Transport(int weight, byte[] coordinate) {
        this.weight = weight;
        this.coordinate = coordinate;
//        System.out.println(this.getValues());
    }

    public abstract void moveObject(float speed);
    public abstract boolean stopObject();

    protected void setValues(float speed, int weight, String color, byte[] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }
    protected String getValues() {
        String info = "Object speed: " + this.speed + ". Weight: " + this.weight + ". Color: " + this.color + ".\n";
        StringBuilder infoCoordinates = new StringBuilder("Coordinates:\n");
        for (byte b : this.coordinate) infoCoordinates.append(b).append("\n");

        return info + infoCoordinates;
    }

    class Engine {
        private boolean isReady;
        private int km;

        public void setValues(boolean isReady, int km) {
            this.isReady = isReady;
            this.km = km;
        }

        public void isReady(boolean isReady) {
            this.isReady = isReady;
        }

        public void info() {
            if (isReady)
                System.out.println("Двигатель исправен");
            else
                System.out.println("Нет он не работает. Он проехал уже " + km + " км");
        }
    }
}
