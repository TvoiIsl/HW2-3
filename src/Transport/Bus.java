package Transport;

public class Bus extends Transport {
    private int weight;
    private String ecoStandard;
    private final int power;

    public Bus(int weight,
               String ecoStandard,
               int power,
               String brand,
               String model,
               int year,
               String country,
               String color,
               double maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
        if (weight <= 3500) {
            this.weight = 10000;
        } else {
            this.weight = weight;
        }
        if (ecoStandard == null) {
            this.ecoStandard = "Euro-5";
        } else {
            this.ecoStandard = ecoStandard;
        }
        if (power <= 200) {
            this.power = 350;
        } else {
            this.power = weight;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getEcoStandard() {
        return ecoStandard;
    }

    public void setEcoStandard(String ecoStandard) {
        this.ecoStandard = ecoStandard;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Марка: " + getBrand() +
                " Модель: " + getModel() +
                " Год выпуска: " + getYear() +
                " Страна производитель: " + getCountry() +
                " Цвет: " + getColor() +
                " Максимальная скорость " + getMaxSpeed() + " км/ч " +
                " Масса: " + weight + " кг " +
                " Экологический стандарт: " + ecoStandard +
                " Мощность " + power + " л.с.";
    }
}
