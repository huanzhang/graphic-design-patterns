package org.hzhang.designpatterns.creational.builder;

/**
 * Created by Zhang Huan on 13/03/2018.
 */
public class SubMealBuilderB extends MealBuilder {
    void buildDrink() {
        meal.setDrink("可乐");
    }

    void buildFood() {
        meal.setFood("鸡肉卷");
    }
}
