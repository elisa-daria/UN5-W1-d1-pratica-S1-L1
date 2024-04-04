package elisadaria.UN5W1d1praticaS1L1;

import elisadaria.UN5W1d1praticaS1L1.entities.MenuElement;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Un5W1D1PraticaS1L1ApplicationTests {

	@Test
	void contextLoads() {
	}
	@ParameterizedTest
	@CsvSource({
			"6.5, 6.5,13","7.5,3,10.5"})
	void isImportoTotaleCorrect(double price1,double price2,double expectedTot){
		List<MenuElement> orderedItems = new ArrayList<>();
		orderedItems.add(price1);
		orderedItems.add(price2);
		double tot=new OrderMaker().calculateImportoTotale(price1,price2)

	}


}
