package dev.sandeep.EcomUserAuthService.controller;

import dev.sandeep.EcomUserAuthService.dto.LoginRequestDTO;
import dev.sandeep.EcomUserAuthService.dto.SignUpRequestDTO;
import dev.sandeep.EcomUserAuthService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody LoginRequestDTO loginRequestDTO){
        return null;
    }

    @GetMapping("/logout")
    public ResponseEntity logout(){
        return null;
    }

    @PostMapping("/signup")
    public ResponseEntity signUp(@RequestBody SignUpRequestDTO signUpRequestDTO){
        return null;
    }

    @GetMapping("/validate")
    public ResponseEntity validate(){
        return null;
    }

}
