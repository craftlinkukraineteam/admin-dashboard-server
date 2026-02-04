package admin.dashboard.server.controller;

import admin.dashboard.server.model.User;
import admin.dashboard.server.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return authService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return authService.login(user);
    }

    @GetMapping("/profile")
    public User profile(@RequestHeader("Authorization") String token) {
        return authService.getProfile(token);
    }
}
