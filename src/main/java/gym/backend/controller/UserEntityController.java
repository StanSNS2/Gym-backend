package gym.backend.controller;

import gym.backend.entity.UserEntity;
import gym.backend.repository.UserEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static gym.backend.consts.SecurityConstants.FRONTEND_BASE_URL;


@RestController
@CrossOrigin(FRONTEND_BASE_URL)
@RequiredArgsConstructor
public class UserEntityController {

    private final UserEntityRepository userEntityRepository;

    @PostMapping("/addUser")
    public String addUser() {
        return "User added.";
    }

    @GetMapping("/getAllUsers")
    public List<UserEntity> getAllUsers() {
        return userEntityRepository.findAll();
    }

}
