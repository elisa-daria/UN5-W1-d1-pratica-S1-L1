package elisadaria.UN5W1d1praticaS1L1.entities;

import elisadaria.UN5W1d1praticaS1L1.enums.StateOfTavolo;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Tavolo {
    private int numero;
    private int maxCoperti;
    private StateOfTavolo statoTavolo;
}
