package com.icet.online_Food.request;

import com.icet.online_Food.model.Address;
import com.icet.online_Food.model.ContactInfo;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class CreateRestaurantRequest {
    private  Long id;
    private  String name;
    private  String description;
    private Address address;
    private ContactInfo contactInfo;
    private List<String> images;

}
