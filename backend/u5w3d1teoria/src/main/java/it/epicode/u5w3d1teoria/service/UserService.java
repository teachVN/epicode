package it.epicode.u5w3d1teoria.service;

import it.epicode.u5w3d1teoria.dto.UniversitaDto;
import it.epicode.u5w3d1teoria.dto.UserDto;
import it.epicode.u5w3d1teoria.exception.NotFoundException;
import it.epicode.u5w3d1teoria.model.Universita;
import it.epicode.u5w3d1teoria.model.User;
import it.epicode.u5w3d1teoria.repository.UniversitaRepository;
import it.epicode.u5w3d1teoria.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(UserDto userDto){
        User user = new User();
        user.setNome(userDto.getNome());
        user.setCognome(userDto.getCognome());
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());

        return userRepository.save(user);
    }

    public List<User> getAllUser(){

        return userRepository.findAll();
    }

    public User getUser(int id) throws NotFoundException {
        return userRepository.findById(id).
                orElseThrow(() -> new NotFoundException("User con id " + id + " non trovato"));
    }

    public User updateUser(int id, UserDto userDto) throws NotFoundException {
        User userDaAggiornare = getUser(id);

        userDaAggiornare.setNome(userDto.getNome());
        userDaAggiornare.setCognome(userDto.getCognome());
        userDaAggiornare.setUsername(userDto.getUsername());
        userDaAggiornare.setPassword(userDto.getPassword());

        return userRepository.save(userDaAggiornare);
    }

    public void deleteUser(int id) throws NotFoundException {
        User userDaCancellare = getUser(id);

        userRepository.delete(userDaCancellare);
    }
}
