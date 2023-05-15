package springframework.spring6di.controllers;

import org.springframework.stereotype.Controller;
import springframework.spring6di.services.EnvironmentService;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;

    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment() {
        return " You are in " + environmentService.getEnv() + " Environment ";
    }
}
