import dao.StudenteDao;
import entities.LibrettoUniversitario;
import entities.Studente;
import enumeration.TipoStudente;

import java.time.LocalDate;
import java.util.Map;

public class ProvaStudente {

    public static void main(String[] args) {
        StudenteDao dao = new StudenteDao();

        Studente s1 = new Studente("Mario", "Rossi",
                LocalDate.of(2000,6,6), TipoStudente.RESIDENTE);

        LibrettoUniversitario librettoUniversitario = new LibrettoUniversitario("UNISA",
                "informatica", 30);

        s1.setLibrettoUniversitario(librettoUniversitario);

        dao.salva(s1);
    }
}
