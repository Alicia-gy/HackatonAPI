package HackatonAPI.controller;

import HackatonAPI.domain.dtos.UsuariDTO;
import HackatonAPI.service.UsuariService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/usuaris")
public class UsuariController {

    private final UsuariService usuariService;

    @PostMapping("/register")
    public ResponseEntity<?> createUsuari(@RequestBody UsuariDTO dto) {
        return new ResponseEntity<>(
                "Usuari creat: \n" + usuariService.create(dto).toString(), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUsuari (@RequestBody UsuariDTO dto,
                                            @PathVariable(value = "id") Long id) {
        return new ResponseEntity<>(
                "Usuari actualitzat: "
                        + usuariService.update(dto, id).toString(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUsuari(@PathVariable(value = "id") Long id) {
        return new ResponseEntity<>(
                usuariService.findById(id).toString(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}/games")
    public ResponseEntity<?> deleteUsuari(@PathVariable(value = "id") Long id) {

        usuariService.deleteByID(id);
        return new ResponseEntity<>(
                "Usuari eliminat", HttpStatus.OK);
    }
}
