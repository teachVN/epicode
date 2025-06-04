package it.epicode.u5w1d2pratica;

import it.epicode.u5w1d2pratica.bean.Drink;
import it.epicode.u5w1d2pratica.bean.Menu;
import it.epicode.u5w1d2pratica.bean.Pizza;
import it.epicode.u5w1d2pratica.bean.Tavolo;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class U5w1d2praticaApplicationTests {
	private static AnnotationConfigApplicationContext ctx;

	@BeforeAll
	public static void creaContesto(){
		ctx = new AnnotationConfigApplicationContext(U5w1d2praticaApplication.class);
	}
	@BeforeEach
	public void PrimaDelTest(){
		System.out.println("inizio test");
	}

	@Test
	public void verificaCostoCopertoTavolo1(){
		Tavolo t1 = ctx.getBean("t1", Tavolo.class);

		Assertions.assertEquals(3,t1.getCostoCoperto());
	}

	@Test
	public void verificaNumeroPizzeEDrink(){

		Menu menu = ctx.getBean(Menu.class);

		long countPizze =menu.getProdotti().stream().filter(prodotto -> prodotto instanceof Pizza).count();
		long countDrink =menu.getProdotti().stream().filter(prodotto -> prodotto instanceof Drink).count();

		Assertions.assertAll(
				()->Assertions.assertEquals(2, countDrink),
				()->Assertions.assertEquals(2, countPizze)

		);
	}
	@AfterEach
	public void DopoIlTest(){
		System.out.println("fine test");
	}

	@AfterAll
	public static void chiudiContesto(){
		ctx.close();
	}

	@ParameterizedTest
	@ValueSource(strings = {"tomato", "mozzarella", "salame"})
	public void verificaBeanEsistenti(String topping){

		Menu menu = ctx.getBean(Menu.class);
		boolean exist = menu.getProdotti().stream().anyMatch(prodotto -> prodotto.getNome().equalsIgnoreCase(topping));
		Assertions.assertTrue(exist);
	}

	@ParameterizedTest
	@CsvSource({"tomato,1", "mozzarella,1", "salame,0"})
	public void verificaToppingMenu(String topping, int atteso){

		Menu menu = ctx.getBean(Menu.class);
		long count = menu.getProdotti().stream().filter(prodotto -> prodotto.getNome().equalsIgnoreCase(topping)).count();
		Assertions.assertEquals(atteso, count);
	}



}
