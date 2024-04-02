package elisadaria.UN5W1d1praticaS1L1;

import elisadaria.UN5W1d1praticaS1L1.entities.Drink;
import elisadaria.UN5W1d1praticaS1L1.entities.Menu;
import elisadaria.UN5W1d1praticaS1L1.entities.Pizza;
import elisadaria.UN5W1d1praticaS1L1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfig {
    @Bean
    public Topping mozzarella(){
        return new Topping("mozzarella",1.8,100);
    }
    @Bean
    public Topping prosciutto() {
        return new Topping("prosciutto", 1.5, 150);
    }
    @Bean
    public Topping pomodoro() {
        return new Topping("pomodoro", 1.3, 130);
    }
    @Bean
    public Topping salamino(){
        return new Topping("salaminio",2,250);
    }
    @Bean
    public Topping olive(){
        return new Topping("olive",0.8,220);
    }
    @Bean
    public Topping funghi(){
        return new Topping("funghi",0.6,80);
    }
    @Bean
    public Drink pepsi(){
        return new Drink("Pepsi",3,500);
    }
    @Bean
    public Drink radler(){
        return new Drink("Radler",4.5,400);
    }
    @Bean
    public Drink bici(){
        return  new Drink("Bici",5,600);
    }
    @Bean
    public Pizza margherita(){
        List<Topping>margherita_toppings=new ArrayList<>();
        margherita_toppings.add(mozzarella());
        margherita_toppings.add(pomodoro());
        return new Pizza("margherita",6.50,1000, margherita_toppings);
    }
    @Bean
    public Menu classic(){
        return new Menu(margherita(),pepsi());
    }
}
