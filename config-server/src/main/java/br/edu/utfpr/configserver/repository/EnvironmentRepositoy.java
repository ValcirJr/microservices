package br.edu.utfpr.configserver.repository;

import br.edu.utfpr.configserver.model.Environment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvironmentRepositoy extends JpaRepository<Environment, Long> {
}
