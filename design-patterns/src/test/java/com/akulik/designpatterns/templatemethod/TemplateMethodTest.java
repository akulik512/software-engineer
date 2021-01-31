package com.akulik.designpatterns.templatemethod;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Template Method")
class TemplateMethodTest {

    @Test
    void example() {
        System.out.println("Let's make some tea:");
        final Tea tea = new Tea();
        tea.prepareRecipe();

        System.out.println("\nLet's make some coffee:");
        final Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }

}