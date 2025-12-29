package com.icet.online_Food.service;


import com.icet.online_Food.model.User;

public interface UserService {
    public User findUserBYJwtToken(String jwt) throws  Exception;

    public User findUserByEmail(String email) throws Exception;
}
