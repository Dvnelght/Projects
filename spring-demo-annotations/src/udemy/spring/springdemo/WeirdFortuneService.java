package udemy.spring.springdemo;

public class WeirdFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Teach a man to fish or teach a fish to man";
    }
}
