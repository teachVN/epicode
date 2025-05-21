import dao.DiplomaDao;
import dao.ProfessoreDao;
import dao.ScuolaDao;
import dao.StudenteDao;
import entities.*;
import enumeration.TipoStudente;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class ProvaStudente {

    public static void main(String[] args) {
        StudenteDao dao = new StudenteDao();
        DiplomaDao diplomaDao = new DiplomaDao();
        ScuolaDao scuolaDao = new ScuolaDao();
        ProfessoreDao professoreDao = new ProfessoreDao();

        Studente s1 = new Studente("Mario", "Rossi",
                LocalDate.of(2000,6,6), TipoStudente.RESIDENTE);

        LibrettoUniversitario librettoUniversitario = new LibrettoUniversitario("UNISA",
                "informatica", 30);
        //creo il diploma
        Diploma diploma = new Diploma(80, "Galileo Galilei", "Perito Industriale");
    //salvo il diploma sul db
        diplomaDao.salva(diploma);

        s1.setLibrettoUniversitario(librettoUniversitario);
        //setto il diploma sullo studente
        s1.setDiploma(diploma);
        //salvo sul db lo studente
        dao.salva(s1);

        //creo una scuola e poi la salvo sul db
        Scuola scuola = new Scuola("De Santis");
        scuolaDao.salva(scuola);
        //aggancio la scuola allo studente che quindi avrà una fk verso la scuola appena creata e poi salvo sul db
        s1.setScuola(scuola);
        dao.salva(s1);

        Professore professore = new Professore("Einstein","Fisica");

        professore.setStudenti(List.of(s1));

        professoreDao.salva(professore);
    }
}
