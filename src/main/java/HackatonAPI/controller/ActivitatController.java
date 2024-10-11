package HackatonAPI.controller;

import HackatonAPI.domain.dtos.ActivitatDTO;
import HackatonAPI.service.ActivitatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/activitats")
public class ActivitatController {

    private final ActivitatService activitatService;

    @PostMapping("/register")
    public ResponseEntity<?> createActivitat(@RequestBody ActivitatDTO dto) {
        return new ResponseEntity<>(
                "Activitat creada: \n" + activitatService.create(dto).toString(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getActivitat(@PathVariable(value = "id") Long id) {
        return new ResponseEntity<>(
                activitatService.findById(id).toString(), HttpStatus.OK);
    }
}
