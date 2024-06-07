# Car Rental System

## Project Description
This Car Rental System is designed using Object-Oriented Programming principles. It includes functionalities for car rental, customer management, and rental transactions.

## Setup Instructions
1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/CarRentalSystem.git
   cd CarRentalSystem
   ```

2. **Compile the Source Code**
   ```bash
   javac src/*.java
   ```

3. **Run the Application**
   ```bash
   java -cp src Main
   ```

## Running Tests
1. **Compile the Test Code**
   ```bash
   javac -cp .:/path/to/junit5.jar test/*.java
   ```

2. **Run the Tests**
   ```bash
   java -jar /path/to/junit5-console-standalone.jar --class-path . --scan-class-path
   ```

## Classes and Methods
### Car
- `Car(int carId, String make, String model, int year)`
- `getCarId()`, `getMake()`, `getModel()`, `getYear()`, `isAvailable()`
- `setAvailable(boolean available)`
- `toString()`

### Customer
- `Customer(int customerId, String name, String email, String phone)`
- `getCustomerId()`, `getName()`, `getEmail()`, `getPhone()`
- `toString()`

### RentalAgency
- `addCar(Car car)`
- `addCustomer(Customer customer)`
- `rentCar(int carId, int customerId)`
- `returnCar(int carId)`
- `getRentedCarsByCustomer(int customerId)`
- `getCars()`
- `getCustomers()`
