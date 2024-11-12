package com.arcsieghart.curso.resources;

import com.arcsieghart.curso.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Luslec", "luslec@fug.com", "9999999", "viole");
        return ResponseEntity.ok().body(u);
    }
}
