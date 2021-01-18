package factory.factory;

import com.akulik.designpatterns.factory.factory.PizzaStore;
import com.akulik.designpatterns.factory.factory.SimplePizzaFactory;
import org.junit.jupiter.api.Test;

class FactoryTest {

    @Test
    void preparePizza() {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());

        System.out.println("--- Order 1 ---");
        pizzaStore.orderPizza("cheese");

        System.out.println("--- Order 2 ---");
        pizzaStore.orderPizza("pepperoni");

        System.out.println("--- Order 3 ---");
        pizzaStore.orderPizza("clam");
    }
}