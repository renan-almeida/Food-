package com.example.cardapio.food;


import com.example.cardapio.controller.FoodRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "Foods")
@Entity(name = "foods")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    private String image;

    private Integer price;

    // Construtor para a classe conseguir receber os dados que vem do usuário na Controller,
    // do metódo saveFood
    public Food(FoodRequestDTO data) {
        this.title = data.title();
        this.image = data.image();
        this.price = data.price();
    }


}
