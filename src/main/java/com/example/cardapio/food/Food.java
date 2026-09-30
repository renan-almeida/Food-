package com.example.cardapio.food;


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
}
