package org.akulik.ocp.leetcode.designpatterns.adapter;

import org.akulik.ocp.leetcode.designpatterns.adapter.duck.Duck;
import org.akulik.ocp.leetcode.designpatterns.adapter.duck.MallardDuck;
import org.akulik.ocp.leetcode.designpatterns.adapter.turkey.WildTurkey;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Adapter")
class AdapterTest {

  @Test
  void example() {
    final MallardDuck duck = new MallardDuck();

    final WildTurkey turkey = new WildTurkey();
    final Duck turkeyAdapter = new TurkeyAdapter(turkey);

    System.out.println("The Turkey says ...");
    turkey.gobble();
    turkey.fly();

    System.out.println("\nThe Duck says ...");
    duck.quack();
    duck.fly();

    System.out.println("\nThe TurkeyAdapter says ...");
    turkeyAdapter.quack();
    turkeyAdapter.fly();
  }
}
