package HackatonAPI.service.impl;

import HackatonAPI.repository.UsuariRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuariServiceImpl {

    private final UsuariRepository usuariRepository;
}
