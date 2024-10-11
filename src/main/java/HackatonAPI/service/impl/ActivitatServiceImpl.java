package HackatonAPI.service.impl;

import HackatonAPI.domain.dtos.ActivitatDTO;
import HackatonAPI.domain.dtos.UsuariDTO;
import HackatonAPI.domain.entities.Activitat;
import HackatonAPI.exceptions.NotFoundException;
import HackatonAPI.repository.ActivitatRepository;
import HackatonAPI.service.ActivitatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActivitatServiceImpl implements ActivitatService {

    private final ActivitatRepository activitatRepository;


    @Override
    public ActivitatDTO create(ActivitatDTO dto) {
        Activitat activitat = new Activitat(dto);

        activitatRepository.save(activitat);
        return new ActivitatDTO(activitat);
    }

    @Override
    public ActivitatDTO findById(Long id) {

        Activitat activitat = activitatRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Activitat no trobada: id no valida"));

        return new ActivitatDTO(activitat);
    }
}
