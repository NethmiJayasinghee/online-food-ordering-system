package com.icet.online_Food.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class IngredientsCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String name;
    @ManyToOne
    @JsonIgnore
    private  Restaurant restaurant;
    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    private List<Ingredientsitem> ingredientsitems=new ArrayList<>();

}
