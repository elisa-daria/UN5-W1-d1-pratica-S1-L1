package elisadaria.UN5W1d1praticaS1L1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class OrderMaker implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("HEllo World from the runner");

    }
}
