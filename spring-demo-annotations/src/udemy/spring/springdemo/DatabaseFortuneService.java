package udemy.spring.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Random;

@Component
@Lazy
public class DatabaseFortuneService implements FortuneService {

    @Autowired
    @Value("${fortuneData}")
    private String[] data;

    private Random myRandom = new Random();

    @PostConstruct
    public void loadDataFromFile() {
        System.out.println(">> DatabaseFortuneService: inside of loadDataFromFile() method.");
    }

    @Override
    public String getFortune() {
        return data[myRandom.nextInt(data.length)];
    }
}
