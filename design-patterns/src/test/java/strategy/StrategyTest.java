package strategy;

import com.akulik.designpatterns.strategy.Duck;
import com.akulik.designpatterns.strategy.MallardDuck;
import com.akulik.designpatterns.strategy.fly.FlyNoWay;
import com.akulik.designpatterns.strategy.fly.FlyWithWings;
import com.akulik.designpatterns.strategy.quack.Quack;
import com.akulik.designpatterns.strategy.quack.Squeak;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Strategy")
class StrategyTest {

    @Test
    void example() {
        Duck mallard = new MallardDuck();
        mallard.setFlyBehavior(new FlyWithWings());
        mallard.setQuackBehavior(new Squeak());

        mallard.display();

        mallard.performFly();
        mallard.performQuack();

        System.out.println("------------");

        mallard.setFlyBehavior(new FlyNoWay());
        mallard.setQuackBehavior(new Quack());

        mallard.performFly();
        mallard.performQuack();
    }
}