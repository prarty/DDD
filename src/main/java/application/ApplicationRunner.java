package application;

import com.ddd.workshop.domain.model.Cart;
import com.ddd.workshop.domain.model.Item;
import com.ddd.workshop.domain.model.Product;

import java.util.Currency;

public class ApplicationRunner {
    public static void main(String[] args) {
        Cart cart = new Cart(1);
        Product iPadPro = new Product("IPad Pro", Currency.getInstance("INR"), 123);
        Product cricketBat = new Product("GM Cricket bat", Currency.getInstance("INR"), 234);

        Item ipadProItem = new Item(iPadPro, 1);
        Item cricketItem = new Item(cricketBat, 2);

        cart.add(ipadProItem);
        cart.add(cricketItem);

        cart.remove(ipadProItem);
        cart.displayDeletedItems();

        Cart cart1 = new Cart(2);
        Item ipadProItem1 = new Item(iPadPro, 1);
        cart1.add(ipadProItem1);

        System.out.println("Cart>> " +cart.equals(cart1));
    }
}
