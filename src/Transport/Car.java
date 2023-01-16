package Transport;

public class Car extends Transport {

    private double engineVolume;

    private String transmissionBox;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean rubber;
    private Key key;

    public static class Key {
        private final boolean remoteRun;
        private final boolean keyless;

        public Key(boolean remoteRun, boolean keyless) {
            this.remoteRun = remoteRun;
            this.keyless = keyless;
        }

        public boolean isRemoteRun() {
            return remoteRun;
        }

        public boolean isKeyless() {
            return keyless;
        }

        @Override
        public String toString() {
            return (remoteRun ? "удаленный запуск двигателя" : " без удаленого запуска ДВС ") + ", " +
                    (keyless ? " бесключевой доступ" : "бесключевой доступ");
        }
    }

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               String transmissionBox,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               boolean rubber,
               Key key,
               double maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (transmissionBox == null) {
            this.transmissionBox = "АКПП";
        } else {
            this.transmissionBox = transmissionBox;
        }
        if (bodyType == null) {
            this.bodyType = "Кроссовер";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null) {
            this.registrationNumber = "A111AA_111";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberOfSeats <= 0) {
            this.numberOfSeats = 5;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        this.rubber = rubber;
        setKey(key);
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }


    public String getTransmissionBox() {
        return transmissionBox;
    }

    public void setTransmissionBox(String transmissionBox) {
        this.transmissionBox = transmissionBox;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isRubber() {
        return rubber;
    }

    public void setRubber(boolean rubber) {
        this.rubber = rubber;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }

    public void changeTyres(int moth) {
        if ((moth >= 11 && moth <= 12) || (moth >= 1 && moth <= 3)) {
            rubber = false;
        }
        if (moth >= 4 && moth <= 10) {
            rubber = true;
        }
    }

    @Override
    public String toString() {
        return "Марка: " + getBrand() +
                " Модель: " + getModel() +
                " Объем двигателя: " +
                engineVolume + "л Цвет: " +
                getColor() + " Страна производитель: " +
                getCountry() + " Коробка передач: " +
                transmissionBox + " Тип кузова: " +
                bodyType + " Регистрационный номер: " +
                registrationNumber +
                " Количество мест: " + numberOfSeats +
                " Максимальная скорость: " + getMaxSpeed() + " км/ч " +
                (rubber ? " Летняя" : " Зимняя") + " резина" + " ," +
                key;
    }
}
