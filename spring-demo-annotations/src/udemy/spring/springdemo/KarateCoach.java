package udemy.spring.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class KarateCoach implements Coach {

    FortuneService fortuneService;

    public KarateCoach() {
        fortuneService = null;
    }

    @Autowired
    public KarateCoach(@Qualifier("fileFortuneService") FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice 100 front kicks";
    }

    @Override
    public String getDailyFortune() {
        if (fortuneService == null)
            return "There is no luck, only skill";
        return fortuneService.getFortune();
    }
}
