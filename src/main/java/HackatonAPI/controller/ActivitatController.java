package HackatonAPI.controller;

import HackatonAPI.service.ActivitatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/activitats")
public class ActivitatController {

    private final ActivitatService activitatService;
}
