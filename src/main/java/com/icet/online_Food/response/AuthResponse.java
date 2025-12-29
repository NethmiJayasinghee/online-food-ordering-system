package com.icet.online_Food.response;

import com.icet.online_Food.model.USER_ROLE;
import lombok.Data;

@Data
public class AuthResponse {
    private  String jwt;
    private  String message;
    private USER_ROLE role;
}
