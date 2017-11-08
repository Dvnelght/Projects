package udemy.spring.tutorial1;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    public SwimCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "swim 25 laps around the pool";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void initMethod() {
        System.out.println("SwimCoach init is OK");
    }

    public void destroyMethod() {
        System.out.println("SwimCoach destroy is OK");
    }
}
