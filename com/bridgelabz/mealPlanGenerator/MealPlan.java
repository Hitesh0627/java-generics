package com.bridgelabz.mealPlanGenerator;

//Interface for all meal types
public interface MealPlan {
    void displayMeal();
}


//Meal types

//Vegetarian Meal
class VegetarianMeal implements MealPlan {
    @Override
    public void displayMeal() {
        System.out.println("Vegetarian Meal: Chilli Paneer");
    }
}

//Vegan Meal
class VeganMeal implements MealPlan {
    @Override
    public void displayMeal() {
        System.out.println("Vegan Meal: Creamy Vegan Pasta");
    }
}

//High Protein Meal
class HighProteinMeal implements MealPlan {
    @Override
    public void displayMeal() {
        System.out.println("High-Protein Meal: Salmon & Asparagus with Lemon-Garlic Butter Sauce");
    }
}


