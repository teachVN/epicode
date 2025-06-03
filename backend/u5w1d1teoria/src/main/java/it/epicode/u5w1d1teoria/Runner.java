package it.epicode.u5w1d1teoria;

import it.epicode.u5w1d1teoria.bean.Drink;
import it.epicode.u5w1d1teoria.bean.Pizza;
import it.epicode.u5w1d1teoria.bean.Topping;
import it.epicode.u5w1d1teoria.configuration.AppConfig;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component//serve per permettere a Spring di gestire completamente la classe
//tutte le classi con Component vengono istanziate direttamente da Spring e gli
//oggetti creati vengono salvati nel contesto
@Order(1)//deve essere il primo runner ad essere lanciato
public class Runner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        //serve per accedere al contesto di Spring
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(U5w1d1teoriaApplication.class);
        //abbiamo recuperato dal contesto di Spring un oggetto di tipo Drink
        Drink water = ctx.getBean(Drink.class);

        System.out.println(water);

        Topping t1 = ctx.getBean("mozzarella",Topping.class);

        System.out.println(t1);

        Topping t2 = ctx.getBean("tomato",Topping.class);

        System.out.println(t2);

        Pizza p = ctx.getBean(Pizza.class);

        System.out.println(p);
    }
}
