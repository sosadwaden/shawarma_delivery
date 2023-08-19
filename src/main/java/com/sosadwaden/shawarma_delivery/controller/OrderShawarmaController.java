package com.sosadwaden.shawarma_delivery.controller;

import com.sosadwaden.shawarma_delivery.repository.OrderShawarmaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/orders")
@SessionAttributes("shawarmaOrder")
@RequiredArgsConstructor
public class OrderShawarmaController {

    private OrderShawarmaRepository orderShawarmaRepository;



}
