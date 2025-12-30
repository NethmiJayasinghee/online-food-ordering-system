package com.icet.online_Food.request;

import com.icet.online_Food.model.Category;
import com.icet.online_Food.model.Ingredientsitem;
import lombok.Data;

import java.util.List;

@Data
public class CreateFoodRequest {
    private  String name;
    private  String description;
    private  Long price;
    private Category category;
    private List<String> images;
    private Long restaurantId;
    private  boolean vegetarian;
    private  boolean seasional;
    private  List<Ingredientsitem> ingredients;
}
