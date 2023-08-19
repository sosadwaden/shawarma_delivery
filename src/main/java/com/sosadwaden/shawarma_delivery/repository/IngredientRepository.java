package com.sosadwaden.shawarma_delivery.repository;

import com.sosadwaden.shawarma_delivery.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository
        extends JpaRepository<Ingredient, String> {

}
