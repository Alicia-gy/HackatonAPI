package HackatonAPI.service;

import HackatonAPI.domain.dtos.UsuariDTO;

public interface UsuariService {

    UsuariDTO create(UsuariDTO dto);

    UsuariDTO update(UsuariDTO dto, Long id);

    UsuariDTO findById(Long id);

    void deleteByID(Long id);




}
