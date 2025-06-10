package it.epicode.u5w2d2teoria.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//RestController discende da @Component, quindi è una classe gestita automaticamente da Spring
public class BenvenutoController {

    @GetMapping("")
    //endpoint ed è costituito da una coppia metodo http e path, coppia che deve essere unica
    public String benvenuto(){
        return "Benvenuto al nostro servizio Rest";
    }

    @GetMapping("/benvenuto")
    //endpoint ed è costituito da una coppia metodo http e path, coppia che deve essere unica
    public String benvenuto2(@RequestParam String nome){
        //requestParam gestisce i parametri di ingresso passati nell'uri con il ?
        return "Benvenuto " + nome +" al nostro servizio Rest";
    }

    @GetMapping("/{nome}")
    //le parentesi graffe del path indicano la parte variabile del path che verrà usata per
    //valorizzare il parametro di ingresso del metodo annotato con PathVariable
    public String benvenuto(@PathVariable String nome){
        //@PathVariable permette di far capire a Spring che il parametro di ingresso del metodo
        //deve recuperarlo dalla parte variabile del path
        return "Benvenuto " + nome +" al nostro servizio Rest";
    }


}
