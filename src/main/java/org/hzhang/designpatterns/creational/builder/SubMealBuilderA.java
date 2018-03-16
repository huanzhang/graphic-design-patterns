package org.hzhang.designpatterns.creational.builder;

/**
 * Created by Zhang Huan on 13/03/2018.
 */
public class SubMealBuilderA extends MealBuilder {
    void buildDrink() {
        meal.setDrink("果汁");
    }

    void buildFood() {
        meal.setFood("汉堡");
    }
}
