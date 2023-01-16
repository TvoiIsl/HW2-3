package Transport;

public class Transport {

    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private double maxSpeed;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Transport(String brand, String model, int year, String country, String color, double maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        if (color == null) {
            this.color = "Черный";
        } else {
            this.color = color;
        }
        if (maxSpeed <= 100) {
            this.maxSpeed = 150;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

}
