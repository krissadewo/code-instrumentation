package id.co.iconpln.training.listing2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author krissadewo
 * @date 12/19/20 11:26 AM
 */
public class LogbackLog {

    Logger logger = LoggerFactory.getLogger(LogbackLog.class);

    public void showLog() {
        logger.info("an info msg");
        logger.warn("a warning msg");
        logger.error("a error msg");
    }
}
