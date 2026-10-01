package com.example.cardapio.controller;

// DATA TRANSFER OBJECT para tratarmos os dados que vem do usuário.
public record FoodRequestDTO(String title, String image, Integer price) {

}
