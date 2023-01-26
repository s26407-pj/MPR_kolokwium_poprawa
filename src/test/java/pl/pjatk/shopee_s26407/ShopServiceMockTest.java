package pl.pjatk.shopee_s26407;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ShopServiceMockTest {

    @InjectMocks
    private ShopService shopService;

    @Mock
    private ShopStorage shopStorage;

    @Test
    void orderMockTest() {
        Customer customer = new Customer(2, 20);
        Cart cart = new Cart(customer);
        cart.addItemToCar("wine");
        when(ShopService.orderItems(cart));
        assertThat(cart.getItemList()).isNotEmpty;
    }
}
