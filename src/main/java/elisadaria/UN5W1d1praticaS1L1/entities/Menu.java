package elisadaria.UN5W1d1praticaS1L1.entities;

import lombok.*;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//attenzione!
@ToString
public class Menu {
    private List<Pizza> pizzas;
    private List<Drink>drinks;

}