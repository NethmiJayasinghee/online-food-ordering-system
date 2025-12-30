package com.icet.online_Food.service;

import com.icet.online_Food.model.Category;
import com.icet.online_Food.model.Food;
import com.icet.online_Food.model.Restaurant;
import com.icet.online_Food.request.CreateFoodRequest;

import java.util.List;

public interface FoodService {
    public Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant);

    void deleteFood(Long foodId) throws  Exception;

    public List<Food> getRestaurantsFood(Long restaurantId,
                                         boolean isvegitarain,
                                         boolean isNonveg,
                                         boolean isSeasonal,
                                         String foodCategory
    );
    public  List<Food> searchFood(String keyword);
    public  Food findFoodById(Long foodId)throws  Exception;
    public  Food updateAvailabilityStatus(Long foodId) throws  Exception;
}
