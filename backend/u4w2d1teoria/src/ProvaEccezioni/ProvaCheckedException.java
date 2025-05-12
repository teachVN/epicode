package ProvaEccezioni;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class ProvaCheckedException {
    public static void main(String[] args) {
        File file = new File("prova.txt");

        try {
            provaFile(file);
        }
        catch (IOException e){
            System.out.println("Impossibile accedere al file");
            System.out.println(e.getMessage());//stampo il messaggio che accompagna l'eccezione
        }
        catch (FileGiaEsistenteException e){
            System.out.println(e.getMessage());
        }
        finally {
            //gestire la chiusura di risorse aperte prima dell'errore
            //viene eseguito sia se c'è l'eccezione che se non c'è
        }
    }

    /*
    il throws serve per non gestire una eccezione nel metodo in cui si genera, ma per rilanciarla al
    chiamante e farla gestire da lui
     */
    public static void provaFile(File file) throws IOException, FileGiaEsistenteException{

        /*
        il metodo createNewFile lancia una checkedException e siamo obbligati a gestirla altrimenti
        il programma non può essere eseguito.
         */
        //try {
            if(!file.createNewFile()){//il throw serve per generare una eccezione a seguito di un evento
                throw new FileGiaEsistenteException("Il file richiesto è già esistente");
            }
//        }
//        catch (IOException e){
//            System.out.println("Impossibile accedere al file");
//            System.out.println(e.getMessage());//stampo il messaggio che accompagna l'eccezione
//        }
    }
}
