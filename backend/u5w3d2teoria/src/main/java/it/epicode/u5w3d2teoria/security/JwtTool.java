package it.epicode.u5w3d2teoria.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import it.epicode.u5w3d2teoria.exception.NotFoundException;
import it.epicode.u5w3d2teoria.model.User;
import it.epicode.u5w3d2teoria.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtTool {
    //classe gestita direttamente da Spring per la gestione del token
    @Value("${jwt.duration}")
    private long durata;

    @Value("${jwt.secret}")
    private String chiaveSegreta;

    @Autowired
    private UserService userService;

    public String createToken(User user){
        //per generare il token avremo bisogno della data di generazione del token, della durata e dell'id
        //dell'utente per il quale stiamo creando il token. Avremo inoltre bisogno anche della chiave segreta
        //per poter crittografare il token

        return Jwts.builder().issuedAt(new Date()).
                expiration(new Date(System.currentTimeMillis()+durata)).
                subject(String.valueOf(user.getId())).
                signWith(Keys.hmacShaKeyFor(chiaveSegreta.getBytes())).
                compact();
    }


    //metodo per la verifica della validità del token
    public void validateToken(String token){
        Jwts.parser().verifyWith(Keys.hmacShaKeyFor(chiaveSegreta.getBytes())).
                build().parse(token);
    }

    public User getUserFromToken(String token) throws NotFoundException {
        //recuperare l'id dell'utente dal token
        int id = Integer.parseInt(Jwts.parser().verifyWith(Keys.hmacShaKeyFor(chiaveSegreta.getBytes())).
                build().parseSignedClaims(token).getPayload().getSubject());

        return userService.getUser(id);
    }

}
