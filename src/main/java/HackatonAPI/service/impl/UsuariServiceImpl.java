package HackatonAPI.service.impl;

import HackatonAPI.domain.dtos.UsuariDTO;
import HackatonAPI.domain.entities.Usuari;
import HackatonAPI.exceptions.NotFoundException;
import HackatonAPI.repository.UsuariRepository;
import HackatonAPI.service.UsuariService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuariServiceImpl implements UsuariService {

    private final UsuariRepository usuariRepository;

    @Override
    public UsuariDTO create(UsuariDTO dto) {
        Usuari usuari = new Usuari(dto);

        usuariRepository.save(usuari);
        return new UsuariDTO(usuari);
    }

    @Override
    public UsuariDTO update(UsuariDTO dto, Long id) {
        Usuari usuari = usuariRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Usuari no trobat"));

        usuari.setNom(dto.getNom());
        usuariRepository.save(usuari);
        return new UsuariDTO(usuari);
    }

    @Override
    public UsuariDTO findById(Long id) {

        Usuari usuari = usuariRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Usuari no trobat: id no valida"));

        return new UsuariDTO(usuari);
    }

    @Override
    public void deleteByID(Long id) {
        usuariRepository.deleteById(id);
    }
}
