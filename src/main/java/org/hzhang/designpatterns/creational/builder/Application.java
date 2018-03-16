package org.hzhang.designpatterns.creational.builder;

/**
 * Created by Zhang Huan on 13/03/2018.
 */
public class Application {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director();

        director.setBuilder(builder);
        Product product = director.construct();
        product.Show();


        MealBuilder mealBuilderA = new SubMealBuilderA();
        KFCWaiter waiter1 = new KFCWaiter();
        waiter1.setMealBuilder(mealBuilderA);
        waiter1.construct();

        MealBuilder mealBuilderB = new SubMealBuilderB();
        KFCWaiter waiter2 = new KFCWaiter();
        waiter2.setMealBuilder(mealBuilderB);
        waiter2.construct();
    }
}
