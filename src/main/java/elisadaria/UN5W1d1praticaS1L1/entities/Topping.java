package elisadaria.UN5W1d1praticaS1L1.entities;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Topping extends MenuElement {
    private String name;
    private double price;
    private double kiloCal;
}
