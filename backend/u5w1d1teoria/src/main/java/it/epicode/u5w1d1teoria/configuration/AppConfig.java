package it.epicode.u5w1d1teoria.configuration;

import it.epicode.u5w1d1teoria.bean.Drink;
import it.epicode.u5w1d1teoria.bean.Topping;
import it.epicode.u5w1d1teoria.enumeration.TipoDrink;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration //questa classe sarà una classe di configurazione
//per Spring
public class AppConfig {

    @Bean//serve per far capire a Spring che questo metodo
    //deve essere chiamato automaticamente da Spring e che
    //l'oggetto restituito deve essere salvato nel container di Spring
    public Drink getWater(){
        Drink water = new Drink();
        water.setTipoDrink(TipoDrink.ANALCOLICO);
        water.setCalorie(0);
        water.setPrezzo(1);
        water.setNome("Water");
        return water;
    }

    @Bean(name = "tomato")
    @Primary//serve per dare precedenza a questo bean nel caso ce ne siano più di uno dello stesso tipo
    public Topping getTomato(){
        Topping tomato = new Topping();
        tomato.setNome("Tomato");
        tomato.setPrezzo(1);
        tomato.setCalorie(100);
        tomato.setGlutenFree(true);
        return tomato;
    }

    @Bean(name = "mozzarella")
    public Topping getMozzarella(){
        Topping mozzarella = new Topping();
        mozzarella.setNome("Mozzarella");
        mozzarella.setPrezzo(1);
        mozzarella.setCalorie(200);
        mozzarella.setGlutenFree(true);
        return mozzarella;
    }
}
