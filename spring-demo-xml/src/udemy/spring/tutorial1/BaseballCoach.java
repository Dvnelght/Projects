package udemy.spring.tutorial1;

public class BaseballCoach implements Coach{

    //define a private field for the dependency
    private FortuneService fortuneService;

    //define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice.";
    }

    @Override
    public String getDailyFortune() {

        //use my FortuneService to return a fortune
        return fortuneService.getFortune();
    }

    public void initMethod() {
        System.out.println("BaseballCoach init is OK");
    }

    public void destroyMethod() {
        System.out.println("BaseballCoach destroy is OK");
    }
}
