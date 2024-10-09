package HackatonAPI.controller;

import HackatonAPI.service.UsuariService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/usuaris")
public class UsuariController {

    private final UsuariService usuariService;
}
