package udemy.spring.tutorial1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Practice3App {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("practice3-applicationContext.xml");

        // retrieve the bean from the spring container
        Coach swimCoach1 = context.getBean("myCoach", Coach.class);
        Coach swimCoach2 = context.getBean("myCoach", Coach.class);

        Coach baseballCoach1 = context.getBean("aCoach", Coach.class);
        Coach baseballCoach2 = context.getBean("aCoach", Coach.class);

        // test the scope of the myCoach and aCoach beans
        boolean myCoachResult = swimCoach1 == swimCoach2;
        boolean aCoachResult = baseballCoach1 == baseballCoach2;

        // print out the result
        System.out.println("\nmyCoachResult: " + myCoachResult + ". Expected is true.");

        System.out.println("\naCoachResult: " + aCoachResult + ", Expected is false.");

        // close the context
        context.close();
    }
}
