package id.co.iconpln.training.listing3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author krissadewo
 * @date 12/19/20 2:22 PM
 */
public class LogstashLogback {

    static Logger logger = LoggerFactory.getLogger(LogstashLogback.class);

    public void showLog() {
        logger.info("hi my name is kris, this is an info msg");
        logger.warn("hi my name is kris, a warning msg");
        logger.error("hi my name is kris, an error msg");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
