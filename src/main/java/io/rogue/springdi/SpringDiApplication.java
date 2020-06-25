package io.rogue.springdi;

import io.rogue.springdi.config.FakeConfig;
import io.rogue.springdi.controller.ConstructorInjectedController;
import io.rogue.springdi.controller.PropertyInjectedController;
import io.rogue.springdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringDiApplication.class, args);

        System.out.println("xxxxxx Property Injection xxxxxx");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.sayHello());

        System.out.println("xxxxxx Setter Injection xxxxxx");
        SetterInjectedController setterInjectedController = (SetterInjectedController) applicationContext.getBean("setterInjectedController");
        System.out.println(setterInjectedController.sayHello());

        System.out.println("xxxxxx Constructor Injection xxxxxx");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.sayHello());

        FakeConfig fakeConfig = applicationContext.getBean(FakeConfig.class);
        System.out.printf("User: %s%nPassword: %s%nURL: %s", fakeConfig.getUser(), fakeConfig.getPassword(), fakeConfig.getUrl());
    }

}
