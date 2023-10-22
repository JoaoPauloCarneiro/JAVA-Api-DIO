package me.dio.SantanderBootcamp2023.Controller;

import me.dio.SantanderBootcamp2023.model.User;
import me.dio.SantanderBootcamp2023.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController (UserService userService) {
        this.userService = userService;

    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById (@PathVariable Long id){
        var user= userService.findById(id);
        return ResponseEntity.ok(user);

    }
    @PostMapping("/{id}")
    public ResponseEntity<User> create (@RequestBody User userToCreate){
        var userCreated = userService.create(userToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userToCreate.getId())
                .toUri();
        return ResponseEntity.created(location).body(userCreated);

    }
}