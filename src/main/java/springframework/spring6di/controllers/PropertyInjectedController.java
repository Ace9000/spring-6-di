package springframework.spring6di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import springframework.spring6di.services.GreetingService;

@Controller
public class PropertyInjectedController {

    @Autowired
    GreetingService greetingService;

    public String sayHello() {
       return greetingService.sayGreeting();
    }

}
