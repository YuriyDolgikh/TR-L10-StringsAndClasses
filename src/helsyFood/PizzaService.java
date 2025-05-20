package helsyFood;

public class PizzaService {
    public static double getDifferenceOfCalories(Pizza pizzaOne, Pizza pizzaTwo) {
        return Math.abs(pizzaOne.getCaloriesTotal() - pizzaTwo.getCaloriesTotal());
    }
}
