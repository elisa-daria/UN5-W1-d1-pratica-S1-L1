package elisadaria.UN5W1d1praticaS1L1;

import elisadaria.UN5W1d1praticaS1L1.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Un5W1D1PraticaS1L1Application {

	public static void main(String[] args) {
		SpringApplication.run(Un5W1D1PraticaS1L1Application.class, args);
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Un5W1D1PraticaS1L1Application.class);
		Menu menu=ctx.getBean(Menu.class);
		System.out.println(menu.getPizza());
		System.out.println(menu.getDrink());

	}

}
