package it.epicode.u5w1d1teoria;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Runner2 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("fine runner 2");
    }
}
