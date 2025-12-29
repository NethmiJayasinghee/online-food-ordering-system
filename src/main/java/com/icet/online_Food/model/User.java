package com.icet.online_Food.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.icet.online_Food.dto.RestaurantDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fullName;
    private String email;
    private String password;
    private USER_ROLE role=USER_ROLE.ROLE_CUSTOMER;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public USER_ROLE getRole() {
        return role;
    }

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "customer")
    @JsonIgnore
    private List<Order> orders=new ArrayList<>();

    @ElementCollection
    private List<RestaurantDto>favorites=new ArrayList();

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Address>addresses=new ArrayList<>();
}
