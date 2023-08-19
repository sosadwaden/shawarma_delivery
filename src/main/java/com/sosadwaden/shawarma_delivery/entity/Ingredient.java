package com.sosadwaden.shawarma_delivery.entity;

import jakarta.persistence.*;
import lombok.*;

// TODO срок годности ингредиента
@Entity
@Table(name = "ingredient")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@Data
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "count")
    private int count;

    @Column(name = "type")
    private Type type;

}
