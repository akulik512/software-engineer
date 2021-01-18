package factory.factorymethod;

import com.akulik.designpatterns.factory.factorymethod.store.ChicagoPizzaStore;
import com.akulik.designpatterns.factory.factorymethod.store.NYPizzaStore;
import com.akulik.designpatterns.factory.factorymethod.store.PizzaStore;
import com.akulik.designpatterns.factory.factorymethod.style.Pizza;
import org.junit.jupiter.api.Test;

class FactoryMethodTest {

    @Test
    void factoryMethodTest() {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        System.out.println("--- Order 1 ---");
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        System.out.println("--- Order 2 ---");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}