package br.edu.utfpr.configserver.service.impl;

import br.edu.utfpr.configserver.model.Environment;
import br.edu.utfpr.configserver.repository.EnvironmentRepositoy;
import br.edu.utfpr.configserver.service.EnvironmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service @Slf4j @RequiredArgsConstructor
public class EnvironmentServiceImpl implements EnvironmentService {

    private final EnvironmentRepositoy environmentRepositoy;

    @Override
    public Environment save(Environment environment) {
        log.info("saving a new propertie to {} ", environment);
        return environmentRepositoy.save(environment);
    }
}
