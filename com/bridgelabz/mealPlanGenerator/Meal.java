package com.bridgelabz.mealPlanGenerator;

//Generic class that manages meal plans
public class Meal<T extends MealPlan> {
    private T mealType;

    public Meal(T mealType) {
        this.mealType = mealType;
    }

    public void showMealDetails() {
        mealType.displayMeal();
    }
}
