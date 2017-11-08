package udemy.spring.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Practice5App {

    public static void main(String[] args) {

        // read the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("practice5-applicationContext.xml");

        // retrieve the bean
        Coach theCoach = context.getBean("karateCoach", Coach.class);

        // call methods on our bean
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
