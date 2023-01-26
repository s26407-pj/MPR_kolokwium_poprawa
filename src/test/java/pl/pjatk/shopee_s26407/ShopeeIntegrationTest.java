package pl.pjatk.shopee_s26407;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootApplication
public class ShopeeIntegrationTest {

    @Autowired
    private ShopService shopService;

    @MockBean
    private ShopStorage shopStorage;

    @Test
    void shouldNotSell() {
        Customer customer = new Customer(2, 20);
        Cart cart = new Cart(customer);
        cart.addItemToCar("wine");

    }
}
