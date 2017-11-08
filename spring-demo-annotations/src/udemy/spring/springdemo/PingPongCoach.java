package udemy.spring.springdemo;

public class PingPongCoach implements Coach {

    private FortuneService fortuneService;

    public PingPongCoach (FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice 1000 serves";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
