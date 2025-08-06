package com.devcarlossantos.course.resources;

import com.devcarlossantos.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping()
    public ResponseEntity<User> findAll(){
        User user = new User(1L, "Carlos", "71999249874", "Carlos007");
        return ResponseEntity.ok().body(user);
    }
}
