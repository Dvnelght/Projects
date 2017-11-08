package udemy.spring.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Practice7App {

    public static void main(String[] args) {

        // read Spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Practice7Config.class);

        // get the bean from the Spring container
        Coach theCoach = context.getBean("pingPongCoach", Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());


        // close the context
        context.close();
    }
}
