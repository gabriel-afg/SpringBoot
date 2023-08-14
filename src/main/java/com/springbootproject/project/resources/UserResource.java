package com.springbootproject.project.resources;


import com.springbootproject.project.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Gabriel", "123456", "caraio@gmail.com", "12345");
        return ResponseEntity.ok(u);
    }
}
