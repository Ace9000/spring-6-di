package springframework.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springframework.spring6di.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PropertyInjectedControllerTest {

    @Autowired
    PropertyInjectedController propertyInjectedController;
    @Test
    void sayHello() {
        System.out.println(propertyInjectedController.sayHello());
    }
}