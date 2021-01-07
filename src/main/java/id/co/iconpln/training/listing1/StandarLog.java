package id.co.iconpln.training.listing1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author krissadewo
 * @date 12/17/20 3:45 PM
 * <p>
 * Standard Output dan Standard Error
 */
public class StandarLog {

    public void standardOutputStandarError() {
        try {
            System.out.println("Mencoba menduplikasi file");

            Files.readAllBytes(Paths.get("test"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
