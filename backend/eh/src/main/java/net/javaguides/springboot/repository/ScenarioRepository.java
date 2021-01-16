package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import net.javaguides.springboot.model.Scenario;

@Repository
public interface ScenarioRepository extends JpaRepository<Scenario, Long>{
    
}
