package it.epicode.u5w3d2pratica.service;

import it.epicode.u5w3d2pratica.dto.LoginDto;
import it.epicode.u5w3d2pratica.exception.NonTrovatoException;
import it.epicode.u5w3d2pratica.model.User;
import it.epicode.u5w3d2pratica.repository.UserRepository;
import it.epicode.u5w3d2pratica.security.JwtTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtTool jwtTool;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String login(LoginDto loginDto) throws NonTrovatoException {
        User user = userRepository.findByEmail(loginDto.getEmail()).
                orElseThrow(() -> new NonTrovatoException("Email/password non trovati"));

        if(passwordEncoder.matches(loginDto.getPassword(),user.getPassword())){
            //creare il token
           return jwtTool.createToken(user);
        }
        else{
            throw new NonTrovatoException("Email/password non trovati");
        }
    }
}
