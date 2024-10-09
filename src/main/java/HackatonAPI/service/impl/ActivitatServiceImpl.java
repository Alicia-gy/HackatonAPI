package HackatonAPI.service.impl;

import HackatonAPI.repository.ActivitatRepository;
import HackatonAPI.service.ActivitatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ActivitatServiceImpl implements ActivitatService {

    private final ActivitatRepository activitatRepository;


}
