package id.co.iconpln.training.listing1;


import java.util.Objects;
import java.util.logging.Logger;

/**
 * @author krissadewo
 * @date 12/17/20 6:30 PM
 */
public class JavaUtilLog {

    static Logger logger;

    static {
        String path = Objects.requireNonNull(JavaUtilLog.class.getClassLoader()
                .getResource("jul.properties"))
                .getFile();

        System.setProperty("java.util.logging.config.file", path);

        logger = Logger.getLogger(JavaUtilLog.class.getName());
    }

    public static void main(String[] args) {
        new JavaUtilLog().showLog();
    }

    public void showLog() {
        logger.info("an info msg");
        logger.warning("a warning msg");
        logger.severe("a severe msg");
    }

}
