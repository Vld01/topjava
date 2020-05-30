package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.UserMeal;

import java.time.LocalDate;
import java.util.List;

public class CaloriesUtil {
    public static boolean isMoreCaloriesPerDay(List<UserMeal> meals, LocalDate date,  int caloriesPerDay) {
        return caloriesPerDay < meals
                .stream()
                .filter(userMeal -> userMeal.getDateTime().toLocalDate().equals(date))
                .mapToInt(UserMeal::getCalories)
                .sum();
    }
}
