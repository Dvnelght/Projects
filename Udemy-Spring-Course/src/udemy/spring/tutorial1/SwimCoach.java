package udemy.spring.tutorial1;

public class SwimCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "swim 25 laps around the pool";
    }
}
