package swip.ch12wrapping.v0_8;

import org.openqa.selenium.By;

import java.util.function.Supplier;

public enum ShoppingCartBySupplier implements Supplier<By> {
    QUANTITY(By.name("cartDS.shoppingcart_ROW0_m_orderItemVector_ROW0_m_quantity"));

    private final By by;

    ShoppingCartBySupplier(By by) {
        this.by = by;
    }

    @Override
    public By get() {
        return by;
    }
}