package belajar_spring_aop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloServiceTest {
    @Autowired
    private HelloService helloService;

    @Test
    void helloService() {
        Assertions.assertEquals("Hello Zidane", helloService.hello("Zidane"));
        Assertions.assertEquals("Hello Zidane Abiansyah", helloService.hello("Zidane", "Abiansyah"));
        Assertions.assertEquals("Bye Zidane", helloService.bye("Zidane"));
        
        helloService.test();
    }
}
