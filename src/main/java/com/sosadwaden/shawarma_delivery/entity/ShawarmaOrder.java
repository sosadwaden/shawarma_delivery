package com.sosadwaden.shawarma_delivery.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "shawarma_order")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShawarmaOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "placed_at")
    private Date placedAt = new Date();

    @OneToMany()
    private List<Shawarma> tacos = new ArrayList<>();

    private String name;
    private String Street;
    private String city;
    private String houseNumber;
    private String door; // подъезд
    private int apartmentNumber;

    private String ccNumber;
    private String ccExpiration;
    private String ccCCV;
}
