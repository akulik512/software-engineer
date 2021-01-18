package decorator.coffee;

import com.akulik.designpatterns.decorator.coffee.*;
import org.junit.jupiter.api.Test;

class DecoratorTest {

    @Test
    void test() {
        // Make coffee
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

        // Add toppings
        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $ " + beverage1.cost());
    }

}