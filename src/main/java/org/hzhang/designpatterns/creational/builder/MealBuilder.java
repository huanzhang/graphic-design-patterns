package org.hzhang.designpatterns.creational.builder;

/**
 * Created by Zhang Huan on 13/03/2018.
 */
public abstract class MealBuilder {
    protected Meal meal = new Meal();

    abstract void buildDrink();

    abstract void buildFood();

    protected Meal getMeal() {
        return meal;
    }
}
