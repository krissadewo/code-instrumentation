package id.co.iconpln.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);

        try {
            if (args.length > 0) { //activating profiles
                springApplication.setAdditionalProfiles(args);
            }

            springApplication.run(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
