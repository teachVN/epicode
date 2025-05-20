import java.time.LocalDate;
import java.util.Random;

public class ProvaEvento {

    public static void main(String[] args) {
        EventoDao dao = new EventoDao();

        Evento e1 = new Evento(new Random().nextInt(1, 1000),"Concerto 1 maggio",
                LocalDate.of(2025,1,1), "concerto pubblico", TipoEvento.PUBBLICO,
                200000);

        try {
            dao.save(e1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(dao.getById(e1.getId()));

        dao.remove(346);


    }
}
