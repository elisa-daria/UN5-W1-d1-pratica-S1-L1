package elisadaria.UN5W1d1praticaS1L1.entities;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Pizza {
    private String name;
    private double price;
    private double kiloCal;
    private List<Topping>toppings;
}
