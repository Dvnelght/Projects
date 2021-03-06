package udemy.spring.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
// @ComponentScan("udemy.spring.springdemo")
public class SportConfig {

    // define bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    // define beach for our swim coach AND inject dependency
    @Bean
    public SwimCoach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }

}
