package springframework.spring6di.controllers;

import org.springframework.stereotype.Controller;
import springframework.spring6di.services.GreetingService;
import springframework.spring6di.services.GreetingServiceImpl;

@Controller
public class MyController {

    private final GreetingService greetingService;
    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }
    public String sayHello() {
        System.out.println("I'm in the controller");

        return greetingService.sayGreeting();
    }
}
