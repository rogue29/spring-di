package io.rogue.springdi;

import io.rogue.springdi.controller.HelloWorldController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringDiApplication.class, args);
        String[] beans = applicationContext.getBeanDefinitionNames();
        for (String bean : beans) {
            System.out.println(bean);
        }
        HelloWorldController controller = (HelloWorldController) applicationContext.getBean("helloWorldController");
        System.out.println(controller.sayHello());
    }

}
