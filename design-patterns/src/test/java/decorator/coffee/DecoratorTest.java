package decorator.coffee;

import com.akulik.designpatterns.decorator.coffee.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Decorator example 1")
class DecoratorTest {

    @Test
    void example() {
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