package udemy.spring.tutorial1;

public class RandomFortuneService implements FortuneService{

    private String[] fortunes;

    public RandomFortuneService() {
        fortunes = new String[3];
        fortunes[0] = "Today is a good day";
        fortunes[1] = "Today is a bad day";
        fortunes[2] = "Today is what you make it";
    }

    public RandomFortuneService (String[] theFortunes) {
        fortunes = theFortunes;
    }

    public String[] getFortunes() {
        return fortunes;
    }

    public void setFortunes(String[] fortunes) {
        this.fortunes = fortunes;
    }

    @Override
    public String getFortune() {
        int index = (int) (Math.random() * fortunes.length);
        return fortunes[index];
    }
}
