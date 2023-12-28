public class Transport {
    private float speed;
    private int weight;
    private String color;
    private byte[] coordinate;

    public Transport(float _speed, int _weight, String _color, byte[] _coordinate) {
        // Join to DB
        System.out.println("Object created");
        this.setValues(_speed, _weight, _color, _coordinate);
        System.out.println(this.getValues());
    }

    public Transport(int weight, byte[] coordinate) {
        this.weight = weight;
        this.coordinate = coordinate;
        System.out.println(this.getValues());
    }

    public void setValues(float speed, int weight, String color, byte[] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    public String getValues() {
        String info = "Object speed: " + this.speed + ". Weight: " + this.weight + ". Color: " + this.color + ".\n";
        StringBuilder infoCoordinates = new StringBuilder("Coordinates:\n");
        for (byte b : this.coordinate) infoCoordinates.append(b).append("\n");

        return info + infoCoordinates;
    }
}
