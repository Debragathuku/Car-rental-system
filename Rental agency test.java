import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class RentalAgencyTest {
    RentalAgency agency;

    @BeforeEach
    public void setUp() {
        agency = new RentalAgency();
        agency.addCar(new Car(1, "Toyota", "Corolla", 2020));
        agency.addCar(new Car(2, "Honda", "Civic", 2021));
        agency.addCustomer(new Customer(1, "John Doe", "john@example.com", "1234567890"));
        agency.addCustomer(new Customer(2, "Jane Smith", "jane@example.com", "0987654321"));
    }

    @Test
    public void testAddCar() {
        Car car = new Car(3, "Ford", "Fiesta", 2019);
        agency.addCar(car);
        assertEquals(car, agency.getCars().get(2));
    }

    @Test
    public void testAddCustomer() {
        Customer customer = new Customer(3, "Alice Brown", "alice@example.com", "1122334455");
        agency.addCustomer(customer);
        assertEquals(customer, agency.getCustomers().get(2));
    }

    @Test
    public void testRentCar() {
        assertTrue(agency.rentCar(1, 1));
        assertFalse(agency.getCars().get(0).isAvailable());
    }

    @Test
    public void testReturnCar() {
        agency.rentCar(1, 1);
        assertTrue(agency.returnCar(1));
        assertTrue(agency.getCars().get(0).isAvailable());
    }

    @Test
    public void testGetRentedCarsByCustomer() {
        agency.rentCar(1, 1);
        assertEquals(1, agency.getRentedCarsByCustomer(1).size());
        assertEquals(0, agency.getRentedCarsByCustomer(2).size());
    }
}
