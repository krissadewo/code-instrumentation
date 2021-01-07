package id.co.iconpln.training.listing1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.logging.Logger;

/**
 * @author krissadewo
 * @date 12/17/20 6:34 PM
 */
class JavaUtilLogTest {

    static Logger logger;

    @BeforeAll
    public static void init() {
        String path = Objects.requireNonNull(JavaUtilLogTest.class.getClassLoader()
                .getResource("jul.properties"))
                .getFile();

        System.setProperty("java.util.logging.config.file", path);

        logger = Logger.getLogger(JavaUtilLogTest.class.getName());

        System.out.println();
    }

    @Test
    void showLog() {
        new JavaUtilLog().showLog();
    }
}