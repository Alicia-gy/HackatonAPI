package HackatonAPI.service;

import HackatonAPI.domain.dtos.UsuariDTO;
import HackatonAPI.domain.dtos.requests.RegisterRequest;
import HackatonAPI.domain.dtos.requests.UpdateRequest;

public interface UsuariService {

    UsuariDTO create(RegisterRequest request);

    UsuariDTO update(UpdateRequest request, Long id);

    UsuariDTO findById(Long id);

    void deleteByID(Long id);




}
