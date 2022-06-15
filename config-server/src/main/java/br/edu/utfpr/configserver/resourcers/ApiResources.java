package br.edu.utfpr.configserver.resourcers;

import br.edu.utfpr.configserver.model.Environment;
import br.edu.utfpr.configserver.service.EnvironmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("configurations")
@RequiredArgsConstructor
public class ApiResources {

    private final EnvironmentService service;

    @PostMapping
    public ResponseEntity<String> saveConfiguration(@RequestBody Environment environment) {
        return ResponseEntity.ok(service.save(environment).toString());
    }
}
