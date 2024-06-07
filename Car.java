public class Car {
    private int carId;
    private String make;
    private String model;
    private int year;
    private boolean available;

    public Car(int carId, String make, String model, int year) {
        this.carId = carId;
        this.make = make;
        this.model = model;
        this.year = year;
        this.available = true;
    }

    public int getCarId() {
        return carId;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Car [carId=" + carId + ", make=" + make + ", model=" + model + ", year=" + year + ", available=" + available + "]";
    }
}
