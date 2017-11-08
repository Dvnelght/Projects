package udemy.spring.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// @ComponentScan("udemy.spring.springdemo")
public class Practice7Config {

    // define bean for our sad fortune service
    @Bean
    public FortuneService weirdFortuneService() {
        return new WeirdFortuneService();
    }

    // define beach for our swim coach AND inject dependency
    @Bean
    public PingPongCoach pingPongCoach() {
        return new PingPongCoach(weirdFortuneService());
    }

}
