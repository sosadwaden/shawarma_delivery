package com.sosadwaden.shawarma_delivery.controller;

import com.sosadwaden.shawarma_delivery.entity.Ingredient;
import com.sosadwaden.shawarma_delivery.entity.Shawarma;
import com.sosadwaden.shawarma_delivery.entity.ShawarmaOrder;
import com.sosadwaden.shawarma_delivery.entity.Type;
import com.sosadwaden.shawarma_delivery.repository.IngredientRepository;
import com.sosadwaden.shawarma_delivery.repository.OrderShawarmaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
@RequestMapping("/design")
@SessionAttributes("shawarmaOrder")
public class DesignController {

    private final OrderShawarmaRepository orderShawarmaRepository;
    private final IngredientRepository ingredientRepository;

    @ModelAttribute
    public void addIngredientsToModel(Model model) {
        List<Ingredient> ingredients = ingredientRepository.findAll();

        for (Ingredient ingredient: ingredients) {
            System.out.println(ingredient);
        }

        Type[] types = Type.values();
        for (Type type: types) {
            model.addAttribute(type.toString().toLowerCase(),
                    filterByType(ingredients, type));
        }
    }

    @ModelAttribute(name = "shawarmaOrder")
    public ShawarmaOrder getShawarmaOrder() {
        System.out.println("Method getShawarmaOrder");
        return new ShawarmaOrder();
    }

    @ModelAttribute(name = "shawarma")
    public Shawarma getShawarma() {
        System.out.println("Method getShawarma");
        return new Shawarma();
    }

    @GetMapping
    public String getDesign() {
        return "design";
    }

    private List<Ingredient> filterByType(List<Ingredient> ingredients,
                                            Type type) {
        return ingredients
                .stream()
                .filter(x -> x.getType().equals(type))
                .collect(Collectors.toList());
    }

}
