package com.example.cardapio.controller;

import com.example.cardapio.food.Food;
import com.example.cardapio.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Indica que a classe é um controller para o spring
@RequestMapping("food") // indicando a request
public class FoodController {

    @Autowired
    FoodRepository repository;

    // Metodo para salvar alimentos
    // @PostMapping serve para indicarmos ao Java que será um metodo POST.
    // @RequestBody -> Os parâmetros do metódo será o que vier no Body da requisição.
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood (@RequestBody FoodRequestDTO data) {
        Food foodData = new Food(data);
        repository.save(foodData);
        return;
    }
    //CORS "avisa" ao navegador quem pode realizar requisições do metódo.
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll() {
        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList(); //Buscando todos os dados da entidade food.
        return foodList;
    }

}
