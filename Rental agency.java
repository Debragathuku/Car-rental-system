import java.util.*;

public class RentalAgency {
    private List<Car> cars;
    private List<Customer> customers;
    private Map<Integer, Integer> rentals; // Map<CarId, CustomerId>

    public RentalAgency() {
        this.cars = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.rentals = new HashMap<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public boolean rentCar(int carId, int customerId) {
        Car car = findCarById(carId);
        if (car != null && car.isAvailable() && findCustomerById(customerId) != null) {
            car.setAvailable(false);
            rentals.put(carId, customerId);
            return true;
        }
        return false;
    }

    public boolean returnCar(int carId) {
        Car car = findCarById(carId);
        if (car != null && !car.isAvailable()) {
            car.setAvailable(true);
            rentals.remove(carId);
            return true;
        }
        return false;
    }

    public List<Car> getRentedCarsByCustomer(int customerId) {
        List<Car> rentedCars = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : rentals.entrySet()) {
            if (entry.getValue() == customerId) {
                rentedCars.add(findCarById(entry.getKey()));
            }
        }
        return rentedCars;
    }

    private Car findCarById(int carId) {
        for (Car car : cars) {
            if (car.getCarId() == carId) {
                return car;
            }
        }
        return null;
    }

    private Customer findCustomerById(int customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId() == customerId) {
                return customer;
            }
        }
        return null;
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}
