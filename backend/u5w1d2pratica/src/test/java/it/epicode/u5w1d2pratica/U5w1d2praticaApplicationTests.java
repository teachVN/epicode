package it.epicode.u5w1d2pratica;

import it.epicode.u5w1d2pratica.bean.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

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
	@Test
	public void verificaPrezzoMargherita(){
		Pizza margherita = ctx.getBean("margherita", Pizza.class);

		Assertions.assertEquals(5, margherita.getPrezzo());
	}
	@Test
	public void verificaTotaleOrdine(){
		Tavolo t1 = ctx.getBean("t1", Tavolo.class);

		Ordine o1 = new Ordine();
		o1.setNumCoperti(2);
		o1.setTavolo(t1);
		o1.setProdotti(List.of(ctx.getBean("cocaCola", Drink.class),
				ctx.getBean("cocaCola", Drink.class),
				ctx.getBean("margherita", Pizza.class),
				ctx.getBean("primavera", Pizza.class)));

		Assertions.assertEquals(21, o1.totaleOrdine());
	}

	@Test
	public void verificaNumProdottiMenu(){
		Menu menu = ctx.getBean(Menu.class);

		Assertions.assertEquals(7,menu.getProdotti().size());
	}
	@ParameterizedTest
	@CsvSource({"t1,3", "t2,2", "t3,0"})
	public void verificaCostoCopertoTavoli(String tavolo, double costoCoperto){
		Tavolo t = ctx.getBean(tavolo,Tavolo.class);

		Assertions.assertEquals(costoCoperto,t.getCostoCoperto());
	}

	@ParameterizedTest
	@CsvSource({"cocaCola,2", "water,1"})
	public void verificaPrezziDrink(String nomeDrink, int prezzo){
		Drink drink = ctx.getBean(nomeDrink, Drink.class);

		Assertions.assertEquals(prezzo,drink.getPrezzo());
	}



}
