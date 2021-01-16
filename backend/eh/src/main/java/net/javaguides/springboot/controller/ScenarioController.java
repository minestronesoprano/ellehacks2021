package net.javaguides.springboot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.javaguides.springboot.model.Scenario;
import net.javaguides.springboot.repository.ScenarioRepository;

@RestController
@RequestMapping("/api")
public class ScenarioController {

  @Autowired
  private ScenarioRepository scenarioRepository;
  
  @GetMapping("scenarios")
  public List<Scenario> getScenarios() {
    return this.scenarioRepository.findAll();
  }
    
}
