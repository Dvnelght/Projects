package udemy.spring.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
@Lazy
public class FileFortuneService implements FortuneService {

    @Autowired
    @Value("${fileName}")
    private String fileName;

    private List<String> data;
    private Random myRandom = new Random();

    @PostConstruct
    public void loadDataFromFile() {
        System.out.println(">> DatabaseFortuneService: inside of loadDataFromFile() method.");

        File theFile = new File(fileName);

        System.out.println("Reading fortunes from file: " + theFile);
        System.out.println("File exists: " + theFile.exists());

        // initialize array list
        data = new ArrayList<String>();

        // read fortunes from file
        try (BufferedReader br = new BufferedReader(
                new FileReader(theFile))) {

            String tempLine;

            while ((tempLine = br.readLine()) != null) {
                data.add(tempLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getFortune() {
        return data.get(myRandom.nextInt(data.size()));
    }
}
