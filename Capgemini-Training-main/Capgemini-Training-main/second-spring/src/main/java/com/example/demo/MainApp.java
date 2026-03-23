package com.example.demo;
//QUESTIONS : tell spring bean  lifecycle steps ?
// when does postconstruct and constructor run ?
import com.example.Loose.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main (String[] args){
      //  ApplicationContext context =new ClassPathXmlApplicationContext("applicationBeanContext.xml");
       //// ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);//config classs loaded here
//         GreetingService greetingService = (GreetingService) context.getBean("myBean");
     ////   GreetingService greetingService = context.getBean(GreetingService.class);
      ////   greetingService.sayHello();

        //// UserService userService
          ////       = (UserService) context.getBean(UserService.class );
        //// userService.notifyUser("whats up!");


         /* UserService userServiceEmail
                = (UserService) context.getBean("UserServiceEmail");
        userServiceEmail.notifyUser("whats up!");*/
        System.out.println("Starting spring application context ");
        ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Retrieving  Lifecycle bean ");
        LifecycleBean lifecycleBean=context.getBean(LifecycleBean.class);
        lifecycleBean.performTask();
        System.out.println("closing spring context");
    }
}
