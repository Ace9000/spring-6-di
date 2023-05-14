package springframework.spring6di.controllers;

import springframework.spring6di.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello() {
       return greetingService.sayGreeting();
    }

}
