package HackatonAPI.service;

import HackatonAPI.domain.dtos.ActivitatDTO;

public interface ActivitatService {

    ActivitatDTO create (ActivitatDTO dto);

    ActivitatDTO findById (Long id);
}
